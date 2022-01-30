package com.walter.spi;

import com.walter.BaseTests;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.Test;

/**
 * @author think
 * @date 2022/1/30
 *
 */
public class ProtocolTest extends BaseTests {

    @Test
    public void test(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(protocol);
    }
}
