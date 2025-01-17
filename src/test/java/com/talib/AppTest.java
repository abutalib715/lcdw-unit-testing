package com.talib;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Unit test for simple App.
 */

@SpringBootTest
public class AppTest {

    private final Calculator calculator = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    public void testDoSum() {
        int expectedResult = 34;
        int actualResult = calculator.doSum(12, 12, 10);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testDoProduct() {
        int expectedResult = 120;
        int actualResult = calculator.doProduct(12, 10);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testCompareTwoNumber() {
        boolean actualResult = calculator.compareTwoNumber(12, 12);
        assertThat(actualResult).isTrue();
    }
}
