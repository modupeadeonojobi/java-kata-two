package com.example.javakatatwo.katas;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author iModupsy
 * @created 01/08/2022
 */
public class PrimeFactorTest {

    @Test
    public void one_isEqualToAnEmpty() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumber = primeFactor.of(1);
        assertEquals(asList(), primeNumber);
    }

    @Test
    public void two_isEqualToFactorsOfTwo() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumber = primeFactor.of(2);
        assertEquals(asList(2), primeNumber);
    }

    @Test
    public void three_isEqualToFactorOfThree() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumber = primeFactor.of(3);
        assertEquals(asList(3), primeNumber);
    }

    @Test
    public void four_isEqualToListOfPrimeNumbersOfFour() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumber = primeFactor.of(4);
        assertEquals(asList(2, 2), primeNumber);
    }

    @Test
    public void givePrimedFactorsOf6(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumbers = primeFactor.of(6);
        assertEquals(asList(2,3), primeNumbers);
    }

    @Test
    public void givePrimedFactorsOf9(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumbers = primeFactor.of(9);
        assertEquals(asList(3,3), primeNumbers);
    }

    @Test void givePrimedFactorsOf12() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumbers = primeFactor.of(12);
        assertEquals(asList(2,2,3), primeNumbers);
    }


    @Test
    public void givePrimeFactorsOf15(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumbers = primeFactor.of(15);
        assertEquals(asList(3,5), primeNumbers);
    }

    @Test
    public void givePrimeFactorsOf() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeNumerals = primeFactor.of(18);
        assertEquals(asList(2, 3, 3), primeNumerals);

    }
}

