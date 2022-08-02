package com.example.javakatatwo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author iModupsy
 * @created 02/08/2022
 */
public class BooleanCalTest {

    @Test
    public void bool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE");
        assertEquals(true, result);
    }
}
