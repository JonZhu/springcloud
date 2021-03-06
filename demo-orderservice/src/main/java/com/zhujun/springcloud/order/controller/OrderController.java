package com.zhujun.springcloud.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhujun.springcloud.order.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @desc OrderController
 * @time 2018/8/28 16:22
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("/create")
    @HystrixCommand(fallbackMethod = "createOrderFallback")
    public String createOrder(String good) {
        return "test createOrder, " + userClient.hello("abc");
    }

    public String createOrderFallback(String good) {
        return "test createOrder createOrderFallback";
    }

}
