package com.example.javakatatwo.katas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();

        int divider = 2;

        // Still needs refactoring
        while (number > 1) {

            while (number % divider == 0) {
                factors.add(divider);
                number /= divider;
            }

            divider ++;
        }

        return factors;

    }
}