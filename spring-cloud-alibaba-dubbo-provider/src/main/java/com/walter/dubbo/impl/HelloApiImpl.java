package com.walter.dubbo.impl;

import com.walter.dubbo.vo.SayHelloRequest;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@DubboService(cluster = "failfast", loadbalance = "roundrobin")
public class HelloApiImpl implements HelloApi {

    @Override
    public String say(SayHelloRequest request) {
        return String.format("%s says hello to %s", request.getFrom(), request.getTo());
    }
}
