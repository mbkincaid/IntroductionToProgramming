package com.packt.javapath.ch06demo.api.impl;

import com.packt.javapath.ch06demo.api.Calculator;

public class CalculatorImpl implements Calculator {
    public int multiplyByTwo(int i) {
        System.out.println(CalculatorImpl.class.getClass().getName());
        return i * 2;
    }
}
