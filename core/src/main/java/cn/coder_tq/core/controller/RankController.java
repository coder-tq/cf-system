package cn.coder_tq.core.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder_tq
 * @Date 2021/5/27 21:56
 */
@Api(tags = "排名",value = "查询排名信息")
@RestController
public class RankController {

    /**
     * 查询群内排名信息
     */
    @RequestMapping("/rank/group")
    public void showGroupRank(long groupNumber,@PathVariable long current,
                                              @PathVariable long limit){
        // TODO
    }



}
