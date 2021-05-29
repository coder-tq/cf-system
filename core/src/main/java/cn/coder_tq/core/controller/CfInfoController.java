package cn.coder_tq.core.controller;

import cn.coder_tq.core.DO.CfInfo;
import cn.coder_tq.core.service.CfInfoService;
import cn.coder_tq.core.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder_tq
 * @Date 2021/5/28 20:09
 */
@Api(tags = "cfInfo")
@RestController
public class CfInfoController {
    @Autowired
    CfInfoService cfInfoService;

    /**
     * 更新所有CfInfo，使用多线程实现，每天自动调用。外部调用需要管理员权限。已经逻辑删除的数据不应该进行更新。
     * @return 更新结果
     */
    public Result updateAllCfInfo() {
        //TODO
        return Result.ok();
    }

    /**
     * 更新一个cfInfo。异步。
     * @param cfInfo 需要更新的cfInfo。
     * @return 更新结果。
     */
    public Result updateCfInfo(CfInfo cfInfo) {
        //TODO
        return Result.ok();
    }
}
