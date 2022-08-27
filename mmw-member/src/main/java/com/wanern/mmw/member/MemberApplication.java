package com.wanern.mmw.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Nacos配置中心入门
 *  一、如何使用Nacos作为配置中心？
 *      1)、引入nacos配置中心依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *      2、在resource下新建bootstrap.properties进行配置
 *          spring.application.name=mmw-member-service(默认为当前模块名称)
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *      3、在nacos管理页面中新建名为mmw-member-service.properties(Data Id)的配置文件
 *      4、给mmw-member-service.properties(Data Id)配置中添加对应配置项
 *      5、动态获取配置属性，在需要获取的类中添加如下注解
 *          @RefreshScope: 类注解动态刷新配置
 *          @Value("${xx.xx.xx}"): 绑定并赋值属性
 *  二、Nacos其它重要组成
 *      1、命名空间
 *          作用：配置隔离
 *              1.1、利用命名空间来做环境隔离(可针对不同环境进行创建命名空间，如：开发、测试、线上)
 *                  注意：此模式需要在bootstrap.properties进行指定配置
 *                      spring.cloud.nacos.config.namespace=命名空间id
 *              1.2、利用微服务不同模块进行隔离
 *                  每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *          默认：默认public，在只有默认空间时所有新增的配置都归属在默认空间下
 *      2、配置集
 *          所有的配置集合叫做配置集(一个微服务下的所有配置信息就叫配置集)
 *      3、配置集ID
 *          类似于文件名
 *          如上Data Id就是配置集ID
 *      4、配置分组
 *          默认分组：DEFAULT_GROUP(默认所有配置集都属于该组)
 *          可根据业务进行定制分组，如双十一，618等可根据业务需求进行定制
 *              spring.cloud.nacos.config.group=11
 *  三、Naco高级使用
 *      1、基于每个微服务创建对应的命名空间，使用配置分组区分开发环境
 *      2、加载多个配置集
 *          将各框架对应的配置进行拆分到nacos中 通过ext-config配置进行整合
 *              spring.cloud.nacos.config.ext-config[0].data-id=datesource.yml
 *              spring.cloud.nacos.config.ext-config[0].group=dev
 *              spring.cloud.nacos.config.ext-config[0].refresh=true
 * Created by Ale on 2022/8/23
 */
@EnableFeignClients("com.wanern.mmw.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
