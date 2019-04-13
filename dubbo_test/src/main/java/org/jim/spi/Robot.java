package org.jim.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * SPI接口
 *
 * 必须标注SPI
 */
@SPI
public interface Robot {
    void sayHello();
}
