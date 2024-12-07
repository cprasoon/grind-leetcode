package org.example.shell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesTest {

    @Test
    void testApp() {
        int[] nums = {1,1,2};
        int size = new RemoveDuplicates().removeDuplicates(nums);
        Assertions.assertEquals(2, size);
        Assertions.assertArrayEquals(new int[]{1,2}, Arrays.copyOf(nums, size));
    }

    @Test
    void testApp1() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int size = new RemoveDuplicates().removeDuplicates(nums);
        Assertions.assertEquals(5, size);
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOf(nums, size));
    }
}
