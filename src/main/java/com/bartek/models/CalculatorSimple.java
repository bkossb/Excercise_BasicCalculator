package com.bartek.models;

public class CalculatorSimple {

    public int add(int a, int b) {
//        //todo implement method here
//        return 0;
        return a + b;
    }

    public int subtract(int a, int b) {
//        //todo implement method here
//        return 0;
        return a - b;
    }

    public int multiplication(int a, int b) {
//        //todo implement method here
//        return 0;
        return a * b;
    }

    public float division(int a, int b) {
//        //todo implement method here
//        return 0;
        if (b == 0) {
            return 0;
        } else {
            return (float)a / (float)b;
        }
    }
}
