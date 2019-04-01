package com.packt.javapath.ch06demo.api;

import com.packt.javapath.ch06demo.Utils;
import com.packt.javapath.ch06demo.api.impl.AnotherCalculatorImpl;
import com.packt.javapath.ch06demo.api.impl.CalculatorImpl;

public interface Calculator {

    int multiplyByTwo(int i);

    String CONF_NAME = "calculator.conf";
    String CONF_WHICH_IMPL = "which.impl";

    static Calculator createInstance() {
        String whichImpl = Utils.getStringValueFromConfig(Calculator.CONF_NAME,
                Calculator.CONF_WHICH_IMPL);
        if (whichImpl.equals(WhichImpl.multiplies.name())) {
            return new CalculatorImpl();
        } else if (whichImpl.equals(WhichImpl.adds.name())) {
            return new AnotherCalculatorImpl();
        } else {
            throw new RuntimeException("Houston, we have a problem. " +
                    "Unknown key " + Calculator.CONF_WHICH_IMPL +
                    " value " + whichImpl + " is in config.");
        }
    }

    enum WhichImpl {
        multiplies,
        adds
    }


}
