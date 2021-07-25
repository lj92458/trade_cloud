package com.liujun.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableCircuitBreaker //通用注解，适应多种断路器 resilience4j
//@EnableHystrix //继承了EnableCircuitBreaker
//@EnableEurekaClient //不推荐。
@EnableDiscoveryClient //比EnableEurekaClient更通用。discovery service有许多种实现（eureka、consul、zookeeper等等）
@EnableZuulProxy //他是EnableZuulServer的增强版。 当Zuul与Eureka、Ribbon等组件配合使用时，我们使用@EnableZuulProxy 。
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }



}
