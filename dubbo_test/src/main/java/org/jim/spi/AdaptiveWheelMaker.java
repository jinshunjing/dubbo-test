package org.jim.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * 一个代理类，实现自适应拓展
 */
public class AdaptiveWheelMaker implements WheelMaker {
    public Wheel makeWheel(URL param) {
        // 获取wheel的名称
        String wheelName = param.getParameter("wheel.maker");

        // 通过SPI加载具体的拓展实现类
        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getExtension(wheelName);

        // 调用目标方法
        return wheelMaker.makeWheel(param);
    }
}
