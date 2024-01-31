package com.algorithms;

import java.util.Arrays;

public class SearchAlgorithm {

    public static int linearSearch(int needle, int[] haystack) {
        // Implement Linear search logic.
        Arrays.sort(haystack);
        int result = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                result = haystack[i - 1];
            } else {
                i++;
            }
        }
        return result;
    }

    public static int binarySearch(int needle, int[] haystack) {
        // Implement binary search logic here
        //  using iteration; include counter variable and print
        //  statements to show number of iterations.
        int low = 0;
        int high = haystack.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (haystack[mid] < needle) {
                low++;
            } else if (haystack[mid] > needle) {
                high--;
            } else {
                return mid;
            }
        }
        return (low +1);
    }

    // TODO-Lab2.1.C (optional): Modify binarySearch logic to use
    //  recursion, completing the method below, and
    //  modifying the method above to invoke the method below.
    //  For the recursive approach, don't bother counting
    //  the number of iterations/invocations.
    private static int binarySearch(int needle, int[] haystack, int low, int high) {
        // TODO-Lab2.1.C (optional): Implement binary search logic here using recursion.
        return -1;
    }

    public static void main(String[] args) {
        // TODO-Lab2.1.A: Invoke linearSearch(int, int[]) method
        //  (and print the result) twice: once with a value actually
        //  present in the array, and once with a value not in the array.
        // TODO-Lab2.1.B: Invoke binarySearch(int, int[]) method
        //  (and print the result) twice: once with a value actually
        //  present in the array, and once with a value not in the array.
    }

}