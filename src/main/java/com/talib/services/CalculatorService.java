package com.talib.services;

public class CalculatorService {
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int divideTwoNumbers(int a, int b) {
        return a / b;
    }

    public static int subAnyNumbers(int... numbers) {
        int sum = 0;

        for (int n : numbers) {
            return sum += n;
        }

        return sum;
    }
}
