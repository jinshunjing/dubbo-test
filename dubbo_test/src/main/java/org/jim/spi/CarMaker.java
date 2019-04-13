package org.jim.spi;

import com.alibaba.dubbo.common.URL;

public interface CarMaker {
    Car makeCar(URL url);
}
