package com.hope.order;

import com.hope.ribbon.RibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Create by lijin on 2022/3/2 20:21
 */
@SpringBootApplication
@EnableFeignClients
@RibbonClients(
        @RibbonClient(name = "stock", configuration = RibbonRuleConfig.class)
)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
