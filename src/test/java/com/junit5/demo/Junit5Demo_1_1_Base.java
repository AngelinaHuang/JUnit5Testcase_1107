package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

public class Junit5Demo_1_1_Base {
        @Test
        public void addTest() throws InterruptedException {
            int result = Calculator.add(4,2);
            System.out.println(result);
        }
        @Test
        public void subTractTest() throws InterruptedException {
            int result = Calculator.subtract(4,2);
            System.out.println(result);
        }
        @Test
        public void multiplyTest() throws InterruptedException {
            int result = Calculator.multiply(4,2);
            System.out.println(result);
        }
        @Test
        public void divideTest() throws InterruptedException {
            int result = Calculator.divide(4,2);
            System.out.println(result);
        }
        @Test
        public void countTest() throws InterruptedException {
            int result = Calculator.count(1);
            result = Calculator.count(1);
            result = Calculator.count(1);
            result = Calculator.count(1);
            System.out.println(result);
        }
}

