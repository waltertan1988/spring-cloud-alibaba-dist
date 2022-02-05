package com.walter.conf;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author think
 * @date 2022/2/5
 * 自定义默认全局HTTP请求的Sentinel的block异常处理器
 */
@Component
public class CustomHttpSentinelBlockExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.setContentType("application/json;charset=utf-8");
        Map<String, Object> resMap = Maps.newHashMap();
        resMap.put("code", 999);
        resMap.put("msg", "访问人数过多，请稍后再试");
        response.getWriter().println(new ObjectMapper().writeValueAsString(resMap));
    }
}
