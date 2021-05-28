package cn.coder_tq.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder_tq
 * @Date 2021/5/27 21:56
 */
@RestController
public class RankController {

    /**
     * 查询群内排名信息
     */
    @RequestMapping("/rank")
    public void showRank(long groupNumber){

    }

}
