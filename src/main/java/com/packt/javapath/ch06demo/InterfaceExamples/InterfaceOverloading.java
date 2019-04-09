package com.packt.javapath.ch06demo;

public interface InterfaceOverloading {

//    interface A {
//        int m(String s);
//        int m(String s, double d);
//        int m(double d, String s);
//        String m(int i);
//        default double m(double d) {return 42;}
//        default int m(int i, String s) {return 1;}
//        default int m(String s, int i) {return 1;}
//    }
//    interface B {
//        static int m(String s, int i) {return 42;}
//        static int m(String s) {return 42;}
//    }
    interface D {
        default int m(int i, String s) {return 1;}
        default int m(String s, int i) {return 1;}
    }
    interface C {
        default double m(double d) {return 42d;}
    }
    interface B extends C, D {
        int m(double d, String s);
        String m(int i);
    }
    interface A extends B {
        int m(String s);
        int m(String s, double d);
    }
}
