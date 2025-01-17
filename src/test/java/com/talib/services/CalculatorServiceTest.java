//package com.talib.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter = 0;
//
//    @BeforeClass
//    public static void init() {
//        System.out.println("Before start testing");
//        System.out.println("Start testing: " + new Date());
//    }
//
//    @Before
//    public void beforeEach() {
//        System.out.println("before each test case");
//        counter = 0;
//    }
//
//    // Test method for addTwoNumbers
//    @Test
//    public void addTwoNumbersTest() {
//        for (int i = 0; i < 20; i++) {
//            counter += i;
//        }
//
//        System.out.println("counter = " + counter);
//
//        int actualResult = CalculatorService.addTwoNumbers(12, 12);
//        int expectedResult = 24;
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test(timeout = 2000)
//    public void sumAnyNumbersTest() throws InterruptedException {
//        for (int i = 0; i < 200; i++) {
//            counter += i;
//        }
//
////        Thread.sleep(3000);
//
//        System.out.println("counter = " + counter);
//
//        int actualResult = CalculatorService.sumAnyNumbers(4, 6, 8, 2);
//        int expectedResult = 20;
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @AfterClass
//    public static void cleanUp() {
//        System.out.println("After completing all test");
//        System.out.println("Testing done: " + new Date());
//    }
//}
