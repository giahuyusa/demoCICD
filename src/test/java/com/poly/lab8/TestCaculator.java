package com.poly.lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.poly.lab8.example.Calculator;

public class TestCaculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(3, 3), 6);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(2, 2), 0);
    }
}
