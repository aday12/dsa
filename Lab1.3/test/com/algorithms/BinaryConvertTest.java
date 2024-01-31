package com.algorithms;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class BinaryConvertTest {

    // After completing test plan, implement unit tests.
    @Test
    public void binaryToDecimal() {
        Assert.assertEquals("100101", 37, 37, .001);
        Assert.assertEquals("111", 7, 7, .001);
    }

    @Test
    public void octalToDecimal() {
        Assert.assertEquals("2A", 42, 42, .001);
    }
}
