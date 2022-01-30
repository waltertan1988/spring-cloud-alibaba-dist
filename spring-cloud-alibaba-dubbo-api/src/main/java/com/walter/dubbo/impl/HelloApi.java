package com.walter.dubbo.impl;

import com.walter.dubbo.vo.SayHelloRequest;

/**
 * @author think
 */
public interface HelloApi {

    String say(SayHelloRequest request);
}
