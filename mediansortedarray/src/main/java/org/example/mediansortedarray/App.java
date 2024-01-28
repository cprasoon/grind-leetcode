package org.example.mediansortedarray;

import java.util.ArrayList;
import java.util.List;

public class App {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;
        List<Integer> merged = new ArrayList<>(nums1.length + nums2.length);
        while (first < nums1.length && second < nums2.length) {
            if (nums1[first] < nums2[second]) {
                merged.add(nums1[first++]);
            } else if (nums1[first] == nums2[second]) {
                merged.add(nums1[first++]);
                merged.add(nums2[second++]);
            } else {
                merged.add(nums2[second++]);
            }
        }
        if (first != nums1.length) {
            while (first < nums1.length) {
                merged.add(nums1[first++]);
            }
        }
        if (second != nums2.length) {
            while (second < nums2.length) {
                merged.add(nums2[second++]);
            }
        }
        double returnVal = 0.0d;
        int mid = merged.size()/2;
        if (merged.size() % 2 == 0) {
            returnVal = ((double) merged.get(mid-1) + merged.get(mid))/2;
        } else {
            returnVal = merged.get(mid);
        }
        return returnVal;
    }
}
