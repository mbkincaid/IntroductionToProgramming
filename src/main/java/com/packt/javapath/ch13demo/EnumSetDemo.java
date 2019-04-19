package com.packt.javapath.ch13demo;

import java.util.EnumSet;

public class enumSet {
    enum Transport {AIRPLANE, BUS, CAR, TRAIN, TRUCK}

    public static void main(String... args){

        java.util.EnumSet<Transport> set1 = java.util.EnumSet.allOf(Transport.class);
        System.out.println(set1);

        java.util.EnumSet<Transport> set2 = java.util.EnumSet.range(Transport.BUS, Transport.TRAIN);
        System.out.println(set2);

        java.util.EnumSet<Transport> set3 = java.util.EnumSet.of(Transport.BUS, Transport.TRUCK);
        System.out.println(set3);

        java.util.EnumSet<Transport> set4 = java.util.EnumSet.complementOf(set3);
        System.out.println(set4);
    }

}