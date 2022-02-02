package com.walter.web;

import com.walter.conf.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AppProperties appProperties;

    @GetMapping("/ping")
    public String ping(){
        return "success";
    }

    @GetMapping("/profile")
    public String profile(){
        return appProperties.getProfile();
    }
}
