package com.packt.javapath.ch06demo;

import com.packt.javapath.ch06demo.api.Calculator.WhichImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.packt.javapath.ch06demo.api.impl.CalculatorFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import com.packt.javapath.ch06demo.api.Calculator;

@DisplayName("Utils Test")
public class UtilsTest {
    @Test
    @DisplayName("Test reading value from config file by key")
    void getStringValueFromConfig() {
        String filename = "utilstest.conf";
        String value = Utils.getStringValueFromConfig(filename, "some value");
        assertEquals("unknown", value);

        value = Utils.getStringValueFromConfig(filename, "some value");
        assertEquals("unknown", value);
    }
    @Test
    @DisplayName("Test matching config value to enum WhichImpl")
    void getWhichImplValueFromConfig() {
        String configFileName = "utilstest.conf";
        for (int i = 1; i <= Calculator.WhichImpl.values().length; i++) {
            String key = String.valueOf(i);
            WhichImpl whichImpl =
                    Utils.getWhichImplValueFromConfig(configFileName, key);
            System.out.println(key + "=" + whichImpl);
        }
        try {
            WhichImpl whichImpl =
                    Utils.getWhichImplValueFromConfig(configFileName, "unknown");
            fail("Should not get here! whichImpl = " + whichImpl);
        } catch (RuntimeException ex) {
            assertEquals("Houston, we have a problem. " +
                    "Unknown key which.impl value unknown is in config.",
                    ex.getMessage());
        }
    }
}