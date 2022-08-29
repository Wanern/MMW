package com.wanern.mmw.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Gateway使用教程
 *  1、开启Nacos服务注册与发现
 *      1)、启动类中标注@EnableDiscoveryClient注解
 *      2)、在配置文件中配置nacos配置中心地址
 *
 * Created by Ale on 2022/8/29
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
