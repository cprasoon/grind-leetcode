package org.example.shell;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m >= 0 && n > 0) {
            int c1 = m - 1;
            int c2 = n - 1;
            for (int i = (m + n)-1; i >= 0; i--) {
                if (c1 == -1) {
                    nums1[i] = nums2[c2--];
                } else if (c2 == -1) {
                    nums1[i] = nums1[c1--];
                } else {
                    if (nums1[c1] > nums2[c2]) {
                        nums1[i] = nums1[c1--];
                    } else {
                        nums1[i] = nums2[c2--];
                    }
                }
            }
        }
    }
}

