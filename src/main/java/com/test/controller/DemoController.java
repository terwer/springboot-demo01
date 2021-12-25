package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: terwer
 * @date: 2021/12/25 22:30
 * @description:
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/demo",produces = "application/json;charset=utf-8")
    public String demo(){
        return "hello springboot，我来了";
    }
}
