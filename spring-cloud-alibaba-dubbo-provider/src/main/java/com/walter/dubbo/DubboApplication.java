package com.walter.dubbo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class DubboApplication {
	
	public static void main(String[] args) {
		new SpringApplication(DubboApplication.class).run(args);
	}
}
