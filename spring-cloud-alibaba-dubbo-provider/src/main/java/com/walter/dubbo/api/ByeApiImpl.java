package com.walter.dubbo.api;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author walter.tan
 * @date 2023-03-26 17:50
 */
@Slf4j
@DubboService
public class ByeApiImpl implements ByeApi {

    @Override
    public String bye(String who) {
        return who + " say bye.";
    }
}
