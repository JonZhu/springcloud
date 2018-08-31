package com.zhujun.springcloud.order;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @desc OrderApplication
 * @time 2018/8/28 14:57
 */
@SpringBootApplication
@EnableTurbine
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
