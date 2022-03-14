package com.hope.ribbon;

import com.hope.ribbon.rule.CustomRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by lijin on 2022/3/5 16:10
 */
@Configuration
public class RibbonRuleConfig {

    /**
     * 方法名一定要交iRule
     * @return
     */
    @Bean
    public IRule iRule(){
         return new CustomRule();
    }
}
