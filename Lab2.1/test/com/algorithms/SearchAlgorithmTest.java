package com.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class SearchAlgorithmTest {

    // TODO-Lab2.1.D: Implement more tests
    int array[];

    @Before
    public void setUp() {
        array = new int[]{1, 4, 6, 8, 9, 10, 12, 13, 23, 44};
    }

    @Test
    public void linearSearch() {
        int target = 6;
        int expected = 6;
        int actual = SearchAlgorithm.linearSearch(target, array);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchTarget() {
        int target = 6;
        int expected = 2;
        int actual = SearchAlgorithm.binarySearch(target, array);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchNotFound() {
        int target = 7;
        int expected = -4;
        int actual = SearchAlgorithm.binarySearch(target, array);
        assertEquals(expected, actual);
    }

}