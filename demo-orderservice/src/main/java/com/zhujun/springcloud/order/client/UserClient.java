package com.zhujun.springcloud.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @desc UserClient
 * @time 2018/8/28 17:02
 */
@FeignClient(name = "user-service")
public interface UserClient {

    @RequestMapping(value = "/user/hello", method = RequestMethod.GET)
    String hello(@RequestParam("username") String username);

}
