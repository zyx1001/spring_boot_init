package com.zyx.init.demo;

import com.zyx.init.demo.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private TestMapper testMapper;

    @Test
    void contextLoads() {
        System.out.println(applicationContext.toString());
        log.info(applicationContext.toString());
        log.info(testMapper.selectById(1).toString());
    }

}
