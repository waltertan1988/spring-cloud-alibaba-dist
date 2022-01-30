package com.walter.dubbo.impl;

import com.walter.dubbo.vo.SayHelloRequest;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@DubboService(cluster = ClusterRules.FAIL_FAST, loadbalance = LoadbalanceRules.ROUND_ROBIN)
public class HelloApiImpl implements HelloApi {

    @Override
    public String say(SayHelloRequest request) {
        return String.format("%s says hello to %s", request.getFrom(), request.getTo());
    }
}
