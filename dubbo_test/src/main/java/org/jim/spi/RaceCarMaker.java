package org.jim.spi;

import com.alibaba.dubbo.common.URL;

public class RaceCarMaker implements CarMaker {
    private WheelMaker wheelMaker;

    // 注入 AdaptiveWheelMaker
    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    public Car makeCar(URL param) {
        // 通过AdaptiveWheelMaker来加载具体的拓展实现类
        Wheel wheel = wheelMaker.makeWheel(param);

        return new RaceCar(wheel);
    }
}
