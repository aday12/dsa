package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    // Create test methods for bubble sort implementation.
    int[] arr;
    int[] control = new int[]{1, 3, 5, 7, 9};

    @Before
    public void setUp() throws Exception {
        arr = new int[]{9, 7, 5, 3, 1};
    }

    @Test
    public void sortSorts() {
        BubbleSort.sort(arr);
        assertArrayEquals(arr, control);
    }
}