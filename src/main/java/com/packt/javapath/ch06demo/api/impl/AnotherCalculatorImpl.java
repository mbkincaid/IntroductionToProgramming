package com.packt.javapath.ch06demo.api.impl;

import com.packt.javapath.ch06demo.api.Calculator;

public class AnotherCalculatorImpl implements Calculator {
    public int multiplyByTwo(int i) {
        System.out.println(AnotherCalculatorImpl.class.getClass().getName());
        return i + i;
    }
}
