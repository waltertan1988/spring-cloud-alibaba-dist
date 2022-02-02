package com.walter.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tyx
 * @date 2022/2/2
 * 被 @ConfigurationProperties 或 @RefreshScope注解的类可以让nacos动态刷新
 */
@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private String profile;
}
