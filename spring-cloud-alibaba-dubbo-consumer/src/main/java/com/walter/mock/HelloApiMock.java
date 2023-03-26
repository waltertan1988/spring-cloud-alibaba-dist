package com.walter.mock;

import com.alibaba.fastjson2.JSON;
import com.walter.dubbo.api.HelloApi;
import com.walter.dubbo.vo.SayHelloRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Slf4j
public class HelloApiMock implements HelloApi {

    @Override
    public String say(SayHelloRequest request) {
        log.info("say mock is invoked: {}", JSON.toJSONString(request));
        return "无法调用com.walter.dubbo.api.HelloApi.say，服务通过Mock方式降级中，请稍后再试...";
    }

    @Override
    public String talk(String who, String content) {
        log.info("talk mock is invoked: {}, {}", who, content);
        return "无法调用com.walter.dubbo.api.HelloApi.talk，服务通过Mock方式降级中，请稍后再试...";
    }
}
