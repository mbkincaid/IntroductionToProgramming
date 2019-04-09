package com.packt.javapath.ch08demo.traffic.speedmodel.impl;

public class SpeedModelImpl implements SpeedModel {
    public double getSpeedMph (double timeSec, int weightPounds, int horsePower) {
        double v = 2.0 * horsePower * 746 * timeSec * 32.174 / weightPounds;
        return Math.round(Math.sqrt(v) * 0.68);
    }
}
