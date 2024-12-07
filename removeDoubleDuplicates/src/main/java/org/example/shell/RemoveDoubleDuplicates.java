package org.example.shell;

import java.util.Arrays;

public class RemoveDoubleDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int seenCount = 1;
        int lastSeenVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentVal = nums[i];
            System.out.printf("ITR:%d lastSeen:%d currentVal:%d seenCount:%d %n", i, lastSeenVal, currentVal, seenCount);
            if (lastSeenVal == currentVal) {
                if (seenCount < 2) {
                    nums[index++] = currentVal;
                }
                seenCount++;
            } else {
                lastSeenVal = currentVal;
                nums[index++] = currentVal;
                seenCount = 1;
            }
            System.out.printf("ITR:%d lastSeen:%d currentVal:%d seenCount:%d %s %n", i, lastSeenVal, currentVal, seenCount, Arrays.toString(nums));
        }

        System.out.printf("FINAL ARRAY size:%d %s %n", index,  Arrays.toString(nums));
        return index;
    }
}
