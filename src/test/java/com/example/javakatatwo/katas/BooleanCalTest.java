package com.example.javakatatwo.katas;

import ch.qos.logback.classic.boolex.OnErrorEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author iModupsy
 * @created 02/08/2022
 */
public class BooleanCalTest {

    @Test
    public void shouldConvertStringTrueToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE");
        assertEquals(true, result);
    }

    @Test
    public void shouldConvertStringFalseToBool() {
        Calculator calculator= new Calculator();
        boolean result = calculator.evaluate("FALSE");
        assertEquals(false, result);

    }

    @Test
    public void shouldConvertNotTrueToBool(){
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("NOT FALSE");
        assertEquals(false, result);
    }
}
