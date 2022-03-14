package com.hope.ribbon.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Create by lijin on 2022/3/5 16:27
 */
public class CustomRule extends AbstractLoadBalancerRule {

    /**
     * 初始化配置
     *
     * @param iClientConfig
     */
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    /**
     * 简单实现随机
     *
     * @param o
     * @return
     */
    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        // 获取当前请求的服务实例
        List<Server> allServers = loadBalancer.getAllServers();
        // 随机下标
        int i = ThreadLocalRandom.current().nextInt(allServers.size());
        return allServers.get(i);
    }

}
