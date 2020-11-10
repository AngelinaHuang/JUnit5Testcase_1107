package com.junit5.examples.packageC;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClassCTest {

    @Test
    @DisplayName("testCaseC inside ClassCTest inside packageC")
    public void testCaseC() {
        System.out.println("testCaseC inside ClassCTest inside packageC");
    }
}
