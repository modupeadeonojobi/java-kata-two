package com.example.javakatatwo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author iModupsy
 * @created 02/08/2022
 */
public class BooleanCalTest {

//    @Test
//    public void shouldReturnNullForInvalidInput() {
//        Calculator calculator = new Calculator();
//        boolean result = calculator.evaluate("Joy");
//        assertNull(result);
//    }

    @Test
    public void shouldConvertStringTrueToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE");
        assertTrue(result);
    }

    @Test
    public void shouldConvertStringFalseToBool() {
        Calculator calculator= new Calculator();
        boolean result = calculator.evaluate("FALSE");
        assertFalse(result);

    }

    @Test
    public void shouldConvertNotFalseToBool(){
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("NOT FALSE");
        assertTrue(result);
    }

    @Test
    public void shouldConvertTrueAndFalseToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE AND FALSE");
        assertFalse(result);
    }

    @Test
    public void shouldConvertTrueAndTrueToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE AND TRUE");
        assertTrue(result);
    }

    @Test
    public void shouldConvertTrueOrFalseToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE OR FALSE");
        assertTrue(result);
    }

    @Test
    public void shouldConvertFalseOrFalseToBool() {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate( "FALSE OR FALSE");
        assertFalse(result);
    }

    @Test
    public void shouldEvaluateMultipleAnd_Or () {
        Calculator calculator = new Calculator();
        boolean result = calculator.evaluate("TRUE OR TRUE OR TRUE AND FALSE");
        assertTrue(result);
    }
}



