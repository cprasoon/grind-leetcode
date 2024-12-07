package org.example.shell;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int duplicates = 0;
        int index = 1;
        int lastVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentVal = nums[i];
            if(currentVal == lastVal){
                duplicates++;
            } else {
                nums[index++] = currentVal;
                lastVal = currentVal;
            }
        }
        return nums.length - duplicates;
    }
}
