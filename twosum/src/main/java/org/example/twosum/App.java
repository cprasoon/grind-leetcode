package org.example.twosum;

import java.util.HashMap;

public class App {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cache.put(nums[i], Integer.valueOf(i));
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (cache.containsKey(diff)) {
                int targetIndex = cache.get(diff);
                if (i != targetIndex) {
                    return new int[]{i, targetIndex};
                }
            }
        }
        return new int[2];
    }
}