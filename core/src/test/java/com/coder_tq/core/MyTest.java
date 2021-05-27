package com.coder_tq.core;

import cn.coder_tq.core.mapper.CfInfoMapper;
import cn.coder_tq.core.service.CfInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class MyTest {

    @Autowired
    CfInfoService cfInfoService;

    @Test
    public void test01(){
        System.out.println(cfInfoService.list());
    }

}
