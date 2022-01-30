package com.walter.dubbo.spi.impl;

import com.walter.dubbo.spi.Driver;

/**
 * @author think
 * @date 2022/1/30
 *
 */
public class MyDriverImpl implements Driver {
    @Override
    public String connect() {
        return "SPI MyDriver connected";
    }
}
