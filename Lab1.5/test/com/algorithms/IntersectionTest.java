package com.algorithms;

import java.util.Set;
import java.util.function.BiFunction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTest {

    private Intersection intersection;

    @Before
    public void setUp() {
        intersection = new Intersection();
    }

    @Test
    public void intersection_nonEmpty() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        Set<Integer> expected = Set.of(24, 66);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_nonEmpty() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        Set<Integer> expected = Set.of(24, 66);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_subset() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{24, 87, 66};
        Set<Integer> expected = Set.of(24, 66, 87);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_subset() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{24, 87, 66};
        Set<Integer> expected = Set.of(24, 66, 87);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_identical() {
        // Implement test of intersection for arrays with all values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
        int[] nums1 = new int[]{0, 9, 7, 8, 6};
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of(0, 6, 7, 8, 9);
        testForSymmetricSuccess(nums1, nums2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_identical() {
        // Implement test of intersectionFast for arrays with all values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
        int[] nums1 = new int[]{0, 9, 7, 8, 6};
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of(0, 6, 7, 8, 9);
        testForSymmetricSuccess(nums1, nums2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_empty() {
        // Implement test of intersection for arrays with no values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
        int[] nums1 = new int[]{2, 4, 1, 3, 5};
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        testForSymmetricSuccess(nums1, nums2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersectionFast_empty() {
        // Implement test of intersectionFast for arrays with no values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
        int[] nums1 = new int[]{2, 4, 1, 3, 5};
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        testForSymmetricSuccess(nums1, nums2, expected, intersection::intersection);
    }


    // Implement tests of intersection and intersectionFast, with a null
    //  value for one or the other (or both) of the arguments, and a NullPointerException being
    //  thrown. Try to take advantage of symmetry, and feel free to create a helper method to reduce
    //  duplicated code.

    @Test
    public void Intersection_null() {
        int[] nums1 = null;
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        assertThrows(NullPointerException.class, () -> {
            intersection.intersection(nums1, nums2);
        });
    }

    @Test
    public void IntersectionFast_null() {
        int[] nums1 = null;
        int[] nums2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        assertThrows(NullPointerException.class, () -> {
            intersection.intersectionFast(nums1, nums2);
        });
    }

    private void testForSymmetricSuccess(int[] a, int[] b, Set<Integer> expected,
                                         BiFunction<int[], int[], Set<Integer>> invocation) {
        assertEquals(expected, invocation.apply(a, b));
        assertEquals(expected, invocation.apply(b, a));
    }

}
