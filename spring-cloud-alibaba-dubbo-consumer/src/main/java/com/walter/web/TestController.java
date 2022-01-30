package com.walter.web;

import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/ping")
    public String ping(){
        return "success";
    }
}
