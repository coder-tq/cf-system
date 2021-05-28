package cn.coder_tq.core.controller;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.service.CfUserMergeService;
import cn.coder_tq.core.service.UserInfoService;
import cn.coder_tq.core.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coder_tq
 * @Date 2021/5/28 18:11
 */
@Api(tags = "用户操作")
@RestController
public class UserController {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    CfUserMergeService cfUserMergeService;

    public Result addUser(UserInfo user){
        return Result.ok();
    }

    @ApiOperation(value = "更新用户")
    public Result updateUser(UserInfo oldUser,UserInfo newUser){
        if (!userInfoService.checkUser(oldUser)){
            return Result.fail(new HashMap<String,String>(1).put("msg","更新失败，原用户信息有误！"));
        }

        return Result.ok();
    }

    public Result login(UserInfo user){
        if (!userInfoService.checkUser(user)){
            return Result.fail(new HashMap<String,String>(1).put("msg","登录失败，账号密码错误！"));
        }
        return Result.ok();
    }

    public Result bindCf(UserInfo user, CfInfo cfInfo){
        if (!cfUserMergeService.save(cfUserMergeService.mergeInfo(user,cfInfo))) {
            return Result.fail();
        }
        return Result.ok();
    }

}
