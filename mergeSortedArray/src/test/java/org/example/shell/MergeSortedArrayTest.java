package org.example.shell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortedArrayTest {

    @Test
    void testApp() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testApp1() {
        int[] nums1 = {45};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(new int[]{45}, nums1);
    }

    @Test
    void testApp2() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {22};
        int n = 1;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(new int[]{22}, nums1);
    }

    @Test
    void testApp3() {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(new int[]{1, 2}, nums1);
    }
}
