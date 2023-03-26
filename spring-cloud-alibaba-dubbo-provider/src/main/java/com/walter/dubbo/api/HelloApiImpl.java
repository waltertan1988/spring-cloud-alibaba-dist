package com.walter.dubbo.api;

import com.alibaba.fastjson2.JSON;
import com.walter.dubbo.vo.SayHelloRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Slf4j
@DubboService(cluster = ClusterRules.FAIL_FAST, loadbalance = LoadbalanceRules.ROUND_ROBIN)
public class HelloApiImpl implements HelloApi {

    private static final String talkFormat = "[%s]%s";

    @Override
    public String say(SayHelloRequest request) {
        log.info("say is invoked: {}", JSON.toJSONString(request));
        return String.format("%s says hello to %s", request.getFrom(), request.getTo());
    }

    @Override
    public String talk(String who, String content) {
        return String.format(talkFormat, who, content);
    }
}
