package com.hope.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Create by lijin on 2022/3/5 14:19
 * 全局配置： 当使用@Configuration会将配置作用所有的报务提供方
 * 局部配置： 1 通过配置类：如果只针对个别服务进行配置，就不要加@Configuration
 *          2 通过配置文件
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    public Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options feignOptions() {
        return new Request.Options(5L, TimeUnit.SECONDS, 10L, TimeUnit.SECONDS, true);
    }

}
