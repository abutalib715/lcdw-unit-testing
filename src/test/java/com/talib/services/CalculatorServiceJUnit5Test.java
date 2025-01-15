package com.talib.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceJUnit5Test {

    @Test
    public void addTwoNumbersTest() {
        int actualResult = CalculatorService.addTwoNumbers(12, 45);
        int expectedResult = 57;

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void sumAnyNumbersTest() throws InterruptedException {

        int actualResult = CalculatorService.sumAnyNumbers(4, 6, 8, 2);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
