package org.example.mediansortedarray;

public class App {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return handleEmptyArrays(nums1, nums2);
        }

        int total = nums1.length + nums2.length;
        int midIndex = 0;
        boolean findSecondVal = false;
        if (total % 2 == 0) {
            midIndex = (total / 2) - 1;
            findSecondVal = true;
        } else {
            midIndex = (total / 2);
        }

        int val1 = 0;
        int val2 = 0;

        int ptr1 = 0;
        int ptr2 = 0;
        boolean equalFlick = true;

        for (int i = 0; i <= midIndex; i++) {
            if (ptr1 == nums1.length) {
                val1 = nums2[ptr2++];
            } else if (ptr2 == nums2.length) {
                val1 = nums1[ptr1++];
            } else {
                if (nums1[ptr1] < nums2[ptr2]) {
                    val1 = nums1[ptr1++];
                } else if (nums1[ptr1] > nums2[ptr2]) {
                    val1 = nums2[ptr2++];
                } else {
                    if (equalFlick) {
                        val1 = nums1[ptr1++];
                    } else {
                        val1 = nums2[ptr2++];
                    }
                    equalFlick = !equalFlick;
                }
            }
        }
        double result = val1;
        if (findSecondVal) {
            if (ptr1 == nums1.length) {
                val2 = nums2[ptr2];
            } else if (ptr2 == nums2.length) {
                val2 = nums1[ptr1];
            } else {
                if (nums1[ptr1] <= nums2[ptr2]) {
                    val2 = nums1[ptr1];
                } else if (nums1[ptr1] > nums2[ptr2]) {
                    val2 = nums2[ptr2];
                }
            }
            result = ((double) val1 + (double) val2) / 2;
        }
        return result;
    }

    private double handleEmptyArrays(int[] nums1, int[] nums2) {
        double returnVal = 0.0d;

        if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) {
            returnVal = 0.0d;
        } else if (nums1 == null || nums1.length == 0) {
            returnVal = medianOfArray(nums2);
        } else if (nums2 == null || nums2.length == 0) {
            returnVal = medianOfArray(nums1);
        }
        return returnVal;
    }

    private double medianOfArray(int[] array) {
        double returnVal;

        if (array.length % 2 == 0) {
            int mid = array.length / 2;
            returnVal = (0.0d + (array[mid - 1]) + array[mid]) / 2;
        } else {
            int mid = array.length / 2;
            returnVal = array[mid];
        }
        return returnVal;
    }
}
