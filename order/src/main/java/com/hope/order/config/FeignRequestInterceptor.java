package com.hope.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * Create by lijin on 2022/3/5 20:55
 * feign请求拦截器
 * 所有用feign发出的请求的拦截器，注意是feign作为客户端发出请求的，而不是服务端
 */
@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //这里可以添加feign请求的全局参数
        requestTemplate.header("msClientId", "8888");
    }
}
