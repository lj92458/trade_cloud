package com.liujun.admin;

import com.google.common.base.Strings;
import feign.RequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;


@SpringBootApplication(excludeName = {} , exclude = {SecurityAutoConfiguration.class})
//@EnableEurekaClient 这个不推荐使用。跟EnableDiscoveryClient功能重复
@EnableDiscoveryClient
@EnableRedisHttpSession  //这个是zuul的session
//@EnableRedisWebSession  //这个是gateway的，WebSession和HttpSession没有本质区别，只是一个专用于webFlux。 Spring-Session项目可以整合这两种session
//参考 https://blog.csdn.net/yingziisme/article/details/94590953
@EnableCircuitBreaker //支持hystrix等断路器
@EnableFeignClients
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);

    }



    //@Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
            if (!Strings.isNullOrEmpty(sessionId)) {
                requestTemplate.header("Cookie", "SESSION=" + sessionId);
            }
        };
    }


}
