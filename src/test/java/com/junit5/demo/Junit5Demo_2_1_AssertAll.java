package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Demo_2_1_AssertAll {
    @Test
    @Order(1)
    public void addTest() throws InterruptedException {
        int result01 = Calculator.add(4,2);
        System.out.println(result01);

        int result02 = Calculator.add(5,2);
        System.out.println(result02);

        int result03 = Calculator.add(6,2);
        System.out.println(result03);
        assertAll("计算结果校验： ",
                ()-> assertEquals(6,result01),
                ()-> assertEquals(6,result02),
                ()-> assertEquals(7,result03)
        );
    }
    @Test
    public void subTractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @Test
    @Order(2)
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);

    }
    @Test
    @Order(3)
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(2,result);

    }
    @BeforeEach
    public void clear(){
        Calculator.clear();
    }
    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);
    }

}
