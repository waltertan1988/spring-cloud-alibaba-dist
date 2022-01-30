package com.walter.mock;

import com.walter.dubbo.impl.HelloApi;
import com.walter.dubbo.vo.SayHelloRequest;

/**
 * @author think
 * @date 2022/1/29
 *
 */
public class HelloApiMock implements HelloApi {

    @Override
    public String say(SayHelloRequest request) {
        return "无法调用com.walter.dubbo.impl.HelloApi.say，服务降级中，请稍后再试...";
    }
}
