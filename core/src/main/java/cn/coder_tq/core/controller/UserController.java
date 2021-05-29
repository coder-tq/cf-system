package cn.coder_tq.core.controller;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.DO.CfUserMerge;
import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.service.CfInfoService;
import cn.coder_tq.core.service.CfUserMergeService;
import cn.coder_tq.core.service.UserInfoService;
import cn.coder_tq.core.utils.Result;
import cn.coder_tq.core.utils.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author coder_tq
 * @Date 2021/5/28 18:11
 */
@Api(tags = "用户操作")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    CfUserMergeService cfUserMergeService;
    @Autowired
    CfInfoService cfInfoService;

    @ApiOperation(value = "发送验证码")
    @PostMapping("/sendVerificationCode")
    public Result sendVerificationCode(UserInfo userInfo, HttpServletRequest request){
        //TODO 判断短时间内是否重复发送验证码，计划使用redis实现。

        //检查用户是否已经注册。
        if (userInfoService.isRegistered(userInfo)) {
            return Result.build(null,ResultCodeEnum.USER_ALREADY_REGISTERED);
        }
        try {
            userInfoService.sendVerificationCode(userInfo,request);
        } catch (Exception e) {
            return Result.fail(new HashMap<String,String>(1).put("msg","验证码发送失败，请联系管理员处理"));
        }
        return Result.ok();
    }

    public Result verifyUserInfo(UserInfo userInfo, String verifyCode, HttpServletRequest request){
        if (userInfoService.verifyUserInfo(userInfo,verifyCode,request)) {
            addUser(userInfo);
            return Result.ok();
        }
        //TODO 返回信息。
        return Result.fail();
    }

    private Result addUser(UserInfo user){
        //TODO 添加用户
        return Result.ok();
    }

    @ApiOperation(value = "更新用户")
    public Result updateUser(UserInfo oldUser,UserInfo newUser){
        if (!userInfoService.checkUser(oldUser)){
            return Result.fail(new HashMap<String,String>(1).put("msg","更新失败，原用户信息有误！"));
        }
        //TODO 更新用户信息。
        return Result.ok();
    }

    public Result login(UserInfo user){
        if (!userInfoService.checkUser(user)){
            return Result.fail(new HashMap<String,String>(1).put("msg","登录失败，账号密码错误！"));
        }
        //TODO 登录,将登录信息存至session。
        return Result.ok();
    }

    public Result bindCf(UserInfo user, CfInfo cfInfo){
        CfUserMerge merge = cfUserMergeService.mergeInfo(user, cfInfo);
        //TODO 验证操作
        //cfUserMergeService.verifyCfInfo(merge);
        if (!cfUserMergeService.save(merge)) {
            return Result.fail();
        }
        return Result.ok();
    }

}
