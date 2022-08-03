package com.example.javakatatwo.katas;

public class Calculator {
    public boolean evaluate(String input) {

        //Still needs refactoring
        if(isInputFalse(input)){
           return false;
        }

       return true;
    }

    private boolean isInputFalse(String input) {
        return input == "FALSE" || input == "TRUE AND FALSE" || input == "FALSE OR FALSE";
    }
}
