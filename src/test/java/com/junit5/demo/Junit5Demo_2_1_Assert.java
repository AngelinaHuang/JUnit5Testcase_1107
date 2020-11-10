package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Demo_2_1_Assert {
    @Test
    public void addTest() throws InterruptedException {
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @Test
    public void subTractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);

    }
    @Test
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);

    }

}
