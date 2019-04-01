package com.packt.javapath.ch06demo.api.impl;

import com.packt.javapath.ch06demo.api.Calculator;

import static com.packt.javapath.ch06demo.Utils.getStringValueFromConfig;

public class CalculatorFactory {

    public static Calculator create() {
        String whichImpl =
                getStringValueFromConfig("calculator.conf", "which.impl");
        if (whichImpl.equals("multiplies")) {
            return new CalculatorImpl();
        } else if (whichImpl.equals("adds")) {
            return new AnotherCalculatorImpl();
        } else {
            throw new RuntimeException("Houston, we have a problem. " +
                    "Unknown key which.impl value " + whichImpl + " is in config.");
        }
    }
}
