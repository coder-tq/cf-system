package cn.coder_tq.core.service.Impl;

import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.mapper.UserInfoMapper;
import cn.coder_tq.core.service.UserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Override
    public boolean checkUser(UserInfo user) {
        return false;
    }

    @Override
    public String sendVerificationCode(UserInfo userInfo, HttpServletRequest request) throws Exception {
        return null;
    }

    @Override
    public boolean verifyUserInfo(UserInfo userInfo, String verifyCode, HttpServletRequest request) {
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
