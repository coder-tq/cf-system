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

    private Result addCfInfo(CfInfo cfInfo){
        if (!cfInfoService.save(cfInfo)) {
            return Result.fail();
        }
        return Result.ok();
    }

}
