package org.jim.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MySpiTest {

    @Test
    public void testSpi() {
        // 获取SPI接口的ExtensionLoader
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        Robot robot1 = extensionLoader.getExtension("optimusPrime");
        robot1.sayHello();

        Robot robot2 = extensionLoader.getExtension("bumblebee");
        robot2.sayHello();
    }
}
