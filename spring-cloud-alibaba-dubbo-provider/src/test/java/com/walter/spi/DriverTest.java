package com.walter.spi;

import com.walter.BaseTests;
import com.walter.dubbo.spi.Driver;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author think
 * @date 2022/1/30
 *
 */
public class DriverTest extends BaseTests {

    @Test
    public void connect(){
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        String defaultExtensionName = extensionLoader.getDefaultExtensionName();
        Driver driver = extensionLoader.getExtension(defaultExtensionName);
        System.out.println(driver.connect());
    }
}
