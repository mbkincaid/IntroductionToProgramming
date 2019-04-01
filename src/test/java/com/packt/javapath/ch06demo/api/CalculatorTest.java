package com.packt.javapath.ch06demo.api;

import com.packt.javapath.ch06demo.Utils;
import com.packt.javapath.ch06demo.api.Calculator.WhichImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.packt.javapath.ch06demo.api.impl.CalculatorFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("API Calculator tests")
public class CalculatorTest {

    @Test
    @DisplayName("Happy multiplyByTwo")
    void multiplyByTwo() {
        WhichImpl whichImpl = Utils.getWhichImplValueFromConfig(Calculator.CONF_NAME, Calculator.CONF_WHICH_IMPL);
        System.out.println("\n" + Calculator.CONF_WHICH_IMPL + "=" + whichImpl);


        Calculator calculator = CalculatorFactory.create();
        int i = 2;
        int result = calculator.multiplyByTwo(i);
        assertEquals(4, result);
    }
}

