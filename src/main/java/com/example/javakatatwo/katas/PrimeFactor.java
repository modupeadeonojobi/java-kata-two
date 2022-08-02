package com.example.javakatatwo.katas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();

        for  (int divider = 2; divider <= number;) {
            if (number % divider == 0) {
                factors.add(divider);
                number /= divider;
            }
            else {
                divider++;
            }
        }
        return factors;
    }
}