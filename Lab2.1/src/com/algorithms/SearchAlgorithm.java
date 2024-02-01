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
        Arrays.sort(haystack);
        int low = 0;
        int high = haystack.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (haystack[mid] < needle) {
                low = mid + 1;
            } else if (haystack[mid] > needle) {
                high = mid -1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    // Modify binarySearch logic to use
    //  recursion, completing the method below, and
    //  modifying the method above to invoke the method below.
    //  For the recursive approach, don't bother counting
    //  the number of iterations/invocations.
    private static int binarySearch(int needle, int[] haystack, int low, int high) {
        // Implement binary search logic here using recursion.
        Arrays.sort(haystack);
        int left = 0;
        int right = haystack.length - 1;
        int mid = (left + right) / 2;

        if (haystack[mid] == needle) {
            return haystack[mid];
        } else if (haystack[mid] > needle) {
            right = mid - 1;
            return binarySearch(needle, haystack, low, right);
        } else if (needle > haystack[mid]) {
            left = mid + 1;
            return binarySearch(needle, haystack, low, high);
        }
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