package com.walter.web;

import com.walter.dubbo.impl.HelloApi;
import com.walter.dubbo.vo.SayHelloRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @DubboReference(mock = "com.walter.mock.HelloApiMock", cluster = ClusterRules.FAIL_FAST)
    private HelloApi helloApi;

    @GetMapping("/say")
    public String sayHello(String from, String to){
        SayHelloRequest request = new SayHelloRequest().setFrom(from).setTo(to);
        return helloApi.say(request);
    }
}
