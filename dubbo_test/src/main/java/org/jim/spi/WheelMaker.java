package org.jim.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface WheelMaker {
    @Adaptive
    Wheel makeWheel(URL param);
}
