package com.walter.dubbo.api;

import com.alibaba.fastjson2.JSON;
import com.walter.dubbo.vo.SayHelloRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Slf4j
@DubboService(cluster = "failfast", loadbalance = "roundrobin")
public class HelloApiImpl implements HelloApi {

    @Override
    public String say(SayHelloRequest request) {
        log.info("say is invoked: {}", JSON.toJSONString(request));
        return String.format("%s says hello to %s", request.getFrom(), request.getTo());
    }
}
