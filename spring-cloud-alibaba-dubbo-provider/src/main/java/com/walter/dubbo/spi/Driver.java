package com.walter.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI("myDriver")
public interface Driver {

    String connect();
}
