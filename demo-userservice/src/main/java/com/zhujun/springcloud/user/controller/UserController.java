package com.zhujun.springcloud.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @desc UserController
 * @time 2018/8/28 13:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello(String username) {
        return "hello: " + username;
    }

}
