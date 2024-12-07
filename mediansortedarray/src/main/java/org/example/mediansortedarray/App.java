package org.example.mediansortedarray;

public class App {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = nums1.length + nums2.length;
        if (mid % 2 != 0) {
            return findSingleMid(nums1, nums2, mid);
        } else {
            return findDualMid(nums1, nums2, mid);
        }
    }

    private double findSingleMid(int[] nums1, int[] nums2, int mid) {
        int index = 0;
        if (mid > nums1.length) {
            index = mid - nums1.length;
            return 0.0d+nums2[index];
        } else {
            return 0.0d + nums1[index];
        }
    }

    private double findDualMid(int[] nums1, int[] nums2, int mid) {
        return 0.0d;
    }
}
