package com.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {22, 15, 13, 9, 6, 3, 1};
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] numbers) {
        // implement bubble sort pseudocode

        for (int k = 1; k < numbers.length; k++) {
            boolean swapped = true;
            for (int j = 0; j < numbers.length - 1 - (k - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swapped = true;
                    swap(numbers, j, j + 1);
                } else {
                    break;
                }
//                if (!swapped) {
//                    break;
//                }
            }
        }
    }

    private static void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
