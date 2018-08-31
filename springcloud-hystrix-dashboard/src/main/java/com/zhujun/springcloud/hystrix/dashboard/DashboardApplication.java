package com.zhujun.springcloud.hystrix.dashboard;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Administrator
 * @desc DashboardApplication
 * @time 2018/8/31 9:46
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DashboardApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
