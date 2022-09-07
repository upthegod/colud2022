package com.cloudpayment8001.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author upgod
 * @description
 * @create 2022-09-21:50
 */
@Configuration
@MapperScan("com.cloudpayment8001.mapper")
public class MybatisConfig {
}
