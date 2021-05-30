package cn.coder_tq.core.service.Impl;

import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.mapper.UserInfoMapper;
import cn.coder_tq.core.service.UserInfoService;
import cn.coder_tq.core.utils.EmailUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private EmailUtil emailUtil;

    private Random random = new Random();

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public boolean checkUser(UserInfo user) {
        return false;
    }

    @Override
    public boolean sendVerificationCode(UserInfo userInfo) throws Exception {
        long qq = userInfo.getQq();
        String email = qq +"@qq.com";
        String subject = "验证码";
        String verificationCode = redisTemplate.opsForValue().get(String.valueOf(qq));
        if (verificationCode == null) {
            verificationCode = String.valueOf(new Random().nextInt(899999) + 100000);
        }
        String text = "您的验证码为: "+verificationCode+",验证码有效期为1小时。\n如果您没有进行相关操作，请忽略该邮件";

        redisTemplate.opsForValue().set(String.valueOf(qq),verificationCode,1, TimeUnit.HOURS);
        emailUtil.sendEmail(email,subject,text);
        return true;
    }

    @Override
    public boolean verifyUserInfo(UserInfo userInfo, String verifyCode) {

        if (verifyCode == null|| userInfo == null) {
            return false;
        }
        String s = redisTemplate.opsForValue().get(String.valueOf(userInfo.getQq()));
        if (s == null) {
            return false;
        }
        if (verifyCode.equals(s.toString())) {
            redisTemplate.delete(String.valueOf(userInfo.getQq()));
            return true;
        }
        return false;
    }

    @Override
    public boolean isRegistered(UserInfo userInfo) {

        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("qq",userInfo.getQq());

        int count = this.count(queryWrapper);

        if (count > 0){
            return true;
        }
        return false;
    }
}
