package com.walter.dubbo.api;

import com.walter.dubbo.vo.SayHelloRequest;

/**
 * @author think
 */
public interface HelloApi {

    String say(SayHelloRequest request);

    String talk(String who, String content);
}
