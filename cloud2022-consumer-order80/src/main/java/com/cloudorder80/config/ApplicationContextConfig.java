package com.cloudorder80.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author upgod
 * @description
 * @create 2022-09-2:49
 */
@Configuration
public class ApplicationContextConfig {

    //使用RestTemplate作为微服务间的通讯，在容器中注册RestTemplate组件
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
