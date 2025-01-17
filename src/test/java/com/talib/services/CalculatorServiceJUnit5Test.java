package com.talib.services;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceJUnit5Test {

    @BeforeAll
    public static void init() {
        System.out.println("Before start testing");
        System.out.println("Start testing: " + new Date());
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each test case");
    }

    @Test
    @DisplayName("Custom Test")
    public void addTwoNumbersTest() {
        int actualResult = CalculatorService.addTwoNumbers(12, 45);
        int expectedResult = 57;
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    @Disabled
    public void sumAnyNumbersTest() {
        int actualResult = CalculatorService.sumAnyNumbers(4, 6, 8, 2);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("After completing all test");
        System.out.println("Testing done: " + new Date());
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each test case");
    }

}
