package com.algorithms;

import java.util.Arrays;

public class SearchAlgorithm {

    public static int linearSearch(int needle, int[] haystack) {
        // Implement Linear search logic.
        Arrays.sort(haystack);
        int result = 0;
        int count = 0;

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
        int count = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (haystack[mid] < needle) {
                low = mid + 1;
            } else if (haystack[mid] > needle) {
                high = mid - 1;
            } else if (haystack[mid] == needle) {
                return mid;
            }
        }
        return -1;
    }

    // Modify binarySearch logic to use
    //  recursion, completing the method below, and
    //  modifying the method above to invoke the method below.
    //  For the recursive approach, don't bother counting
    //  the number of iterations/invocations.
    private static int binarySearch(int needle, int[] haystack, int low, int high) {
        // Implement binary search logic here using recursion.
        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        }

        if (haystack[mid] == needle) {
            return mid;
        } else if (haystack[mid] > needle) {
            return binarySearch(needle, haystack, low, mid - 1);
        } else {
            return binarySearch(needle, haystack, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 9, 10, 12, 13, 23, 44};
        // Invoke linearSearch(int, int[]) method
        //  (and print the result) twice: once with a value actually
        //  present in the array, and once with a value not in the array.
        System.out.println("Linear: Expected = 0 (needle not present), Actual: " + linearSearch(16, array));
        System.out.println("Linear: Expected = 4, Actual: " + linearSearch(6, array));
        // Invoke binarySearch(int, int[]) method
        //  (and print the result) twice: once with a value actually
        //  present in the array, and once with a value not in the array.
        // This line returns the place in the array that contains the needle, not the iterations required to find it
        System.out.println("Binary: Expected = 7, Actual: " + binarySearch(13, array));
        System.out.println("Binary: Expected = -1 (needle not present), Actual: " + binarySearch(2, array));
        // recursive binary tests
        System.out.println("Binary recursive Expected: 2, Actual: " + binarySearch(6, array, 0, array.length - 1));
        System.out.println("Binary recursive Expected: -1 (needle not present), Actual: " + binarySearch(45, array, 0, array.length - 1));
    }

}