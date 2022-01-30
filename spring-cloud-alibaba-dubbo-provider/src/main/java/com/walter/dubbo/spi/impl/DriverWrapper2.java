package com.walter.dubbo.spi.impl;

import com.walter.dubbo.spi.Driver;
import lombok.NoArgsConstructor;

/**
 * @author think
 * @date 2022/1/30
 *
 */
@NoArgsConstructor
public class DriverWrapper2 implements Driver {

    private Driver driver;

    /**
     * SPI的Wrapper，特点是必须带有SPI接口作为唯一参数的构造方法
     * @param driver
     */
    public DriverWrapper2(Driver driver){
        this.driver = driver;
    }

    @Override
    public String connect() {
        return this.getClass().getSimpleName() + "/" + driver.connect();
    }
}
