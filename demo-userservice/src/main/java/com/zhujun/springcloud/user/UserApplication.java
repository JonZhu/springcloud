package com.zhujun.springcloud.user;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Administrator
 * @desc UserApplication
 * @time 2018/8/28 11:07
 */
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UserApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
