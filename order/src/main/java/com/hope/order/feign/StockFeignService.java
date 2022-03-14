package com.hope.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by lijin on 2022/3/5 13:54
 */
@FeignClient(name = "stock", path = "/stock")
public interface StockFeignService {

    @RequestMapping("/deduct")
    String deduct();

}
