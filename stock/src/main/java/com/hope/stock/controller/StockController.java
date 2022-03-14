package com.hope.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by lijin on 2022/3/5 16:14
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/deduct")
    public String deduct(){
         return "扣减库存 9002";
    }
}
