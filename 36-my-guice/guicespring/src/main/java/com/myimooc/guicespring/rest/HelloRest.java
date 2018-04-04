package com.myimooc.guicespring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myimooc.guicespring.service.greeting.GreetingHandler;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 控制器类
 * @describe Hello相关Rest接口类
 */
@RestController
public class HelloRest {

    @Autowired
    private GreetingHandler greetingHandler;

    @GetMapping("/greeting")
    String greeting(@RequestParam("name") String name) {
        return greetingHandler.getByName(name);
    }

}
