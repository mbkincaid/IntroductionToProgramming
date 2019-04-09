package com.packt.javapath.ch08demo;

public interface Vehicle {
    double getSpeedMph(double timeSec);
    static List<Vehicle> getTraffic(int vehiclesCount) {
        return TrafficFactory.get(vehiclesCount);
    }
}


