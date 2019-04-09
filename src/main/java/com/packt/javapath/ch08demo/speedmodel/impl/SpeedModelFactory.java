package com.packt.javapath.ch08demo.traffic.speedmodel.impl;

public class SpeedModelFactory {
    public static SpeedModel speedModel() {
        return new SpeedModelImpl();
    }
}
