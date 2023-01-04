package com.walter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author walter.tan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public class WebApplication {
	
	public static void main(String[] args) {
		new SpringApplication(WebApplication.class).run(args);
	}
}
