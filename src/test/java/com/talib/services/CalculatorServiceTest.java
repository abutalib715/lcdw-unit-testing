package com.talib.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 0;

    // Test method for addTwoNumbers
    @Test
    public void addTwoNumbersTest() {
        for (int i = 0; i < 20; i++) {
            counter += i;
        }

        System.out.println("counter = " + counter);

        int actualResult = CalculatorService.addTwoNumbers(12, 12);
        int expectedResult = 24;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumAnyNumbersTest() {
        for (int i = 0; i < 200; i++) {
            counter += i;
        }

        System.out.println("counter = " + counter);

        int actualResult = CalculatorService.sumAnyNumbers(4, 6, 8, 2);
        int expectedResult = 20;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
