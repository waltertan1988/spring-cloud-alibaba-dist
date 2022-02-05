package com.walter.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.walter.conf.AppProperties;
import com.walter.dubbo.impl.HelloApi;
import com.walter.dubbo.vo.SayHelloRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AppProperties appProperties;
    @DubboReference(mock = "com.walter.mock.HelloApiMock", cluster = "failfast")
    private HelloApi helloApi;

    /**
     * 测试服务是否正常启动
     * @return
     */
    @GetMapping("/ping")
    public String ping(){
        return "success";
    }

    /**
     * 测试dubbo调用及的dubbo mock调用
     * @param from
     * @param to
     * @return
     */
    @GetMapping("/sayHello")
    public String sayHello(String from, String to){
        SayHelloRequest request = new SayHelloRequest().setFrom(from).setTo(to);
        return helloApi.say(request);
    }

    /**
     * 测试配置中心动态刷新
     * @return
     */
    @GetMapping("/profile")
    public String profile(){
        return appProperties.getProfile();
    }

    /**
     * 测试sentinel限流
     * @return
     */
    @GetMapping("/sentinelBlockFlow/{param}")
    @SentinelResource(value = "sentinelBlockFlow", blockHandler = "sentinelBlockFlowHandler")
    public String sentinelBlockFlow(@PathVariable("param") String param){
        return "call sentinelBlockFlow" + param;
    }

    public String sentinelBlockFlowHandler(String param, BlockException ex){
        log.warn(">>>>>>call sentinelBlockFlowHandler, param:{}", param, ex);
        return "call sentinelBlockFlowHandler" + param;
    }
}
