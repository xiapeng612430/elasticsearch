package com.example.elasticsearch.controller;

import com.example.elasticsearch.entity.Person;
import com.example.elasticsearch.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2020/04/22
 * @time 12:47
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    IndexService indexService;

    @PostMapping("/index")
    public void index() {
        Person person = new Person("张三", 12, 1, "数据库工程师");
        try {
            indexService.index("accounts", "person", "1", person);
        } catch (Exception e) {
            logger.error("e:{}", e);
        }
    }

}
