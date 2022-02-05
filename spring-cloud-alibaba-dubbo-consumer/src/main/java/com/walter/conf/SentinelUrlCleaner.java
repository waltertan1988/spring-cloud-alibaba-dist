package com.walter.conf;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.UrlCleaner;
import org.apache.commons.lang.StringUtils;

/**
 * @author think
 * @date 2022/2/5
 * 对接受Sentinel管控的URL进行清洗（新版的sentinel已经不需要这个清洗了？）
 */
// @Component
public class SentinelUrlCleaner implements UrlCleaner {
    @Override
    public String clean(String oldUrl) {
        if(StringUtils.isEmpty(oldUrl)){
            return oldUrl;
        }

        if(oldUrl.startsWith("/test/sentinelBlockFlow/")){
            return "/test/sentinelBlockFlow/*";
        }

        return oldUrl;
    }
}
