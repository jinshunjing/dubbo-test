package org.jim.spi;

public class RaceCar implements Car {
    private Wheel wheel;

    public RaceCar(Wheel wheel) {
        this.wheel = wheel;
    }
}
