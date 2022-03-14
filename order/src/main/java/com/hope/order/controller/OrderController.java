package com.hope.order.controller;

import com.hope.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by lijin on 2022/3/2 20:48
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class OrderController {
    @Value("${nacos.config}")
    private String config;

    @Autowired
    private StockFeignService stockFeignService;

    /**
     * http://localhost:9000/config/getConfig
     */
    @RequestMapping("/getConfig")
    public String get() {
        return config;
    }


    @RequestMapping("/add")
    public String add() {
        return stockFeignService.deduct();
    }
}
