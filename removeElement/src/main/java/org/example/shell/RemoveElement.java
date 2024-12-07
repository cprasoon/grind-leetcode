package org.example.shell;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] result = new int[nums.length];
        int count = 0;
        int j = 0;
        for (int i: nums) {
            if ( i == val) {
                count++;
            } else {
                result[j++] = i;
            }
        }
        for (int i = 0; i < (nums.length - count); i++) {
            nums[i] = result[i];
        }

        return nums.length - count;
    }
}
