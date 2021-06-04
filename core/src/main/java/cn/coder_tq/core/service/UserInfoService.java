package cn.coder_tq.core.service;

import cn.coder_tq.core.DO.CfUserMerge;
import cn.coder_tq.core.DO.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author coder_tq
 * @Date 2021/5/28 19:42
 */
@Service
public interface UserInfoService extends IService<UserInfo> {
    /**
     * 验证账号密码是否正确
     * @param user 用户信息
     * @return 验证结果
     */
    boolean checkUser(UserInfo user);

    /**
     * 将验证码发送至userInfo中的qq邮箱，并将验证码存入session中。
     * @param userInfo 要验证的用户信息。
     * @return String 生成的验证码，如果出现异常则抛出异常。
     * @throws Exception 抛出发送邮件时的异常。
     */
    boolean sendVerificationCode(UserInfo userInfo) throws Exception;


    /**
     * 验证用户输入的验证码是否正确
     * @param userInfo 用户信息。
     * @param verifyCode 用户提供的验证码。
     * @return 验证结果。
     */
    boolean verifyUserInfo(UserInfo userInfo, String verifyCode);

    /**
     * 验证用户是否已经注册
     * @param userInfo 用户信息
     * @return 是否注册
     */
    boolean isRegistered(UserInfo userInfo);

    boolean addUser(UserInfo userInfo);
}
