package com.walter.dubbo.spi.impl;

import com.walter.dubbo.spi.Driver;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author think
 * @date 2022/1/30
 *
 */
public class MyDriverImpl implements Driver {

    private Protocol protocol;

    @Override
    public String connect() {
        return "SPI MyDriver connected";
    }

    /**
     * 通过setter注入其他SPI
     * @param protocol
     */
    public void setProtocol(Protocol protocol){
        this.protocol = protocol;
    }
}
