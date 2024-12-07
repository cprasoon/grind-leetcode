package org.example.shell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveElementTest {

    @Test
    void testApp() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Assertions.assertEquals(2, new RemoveElement().removeElement(nums, val));
        Assertions.assertArrayEquals(new int[]{2, 2}, Arrays.copyOf(nums, 2));
    }

    @Test
    void testApp2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        Assertions.assertEquals(5, new RemoveElement().removeElement(nums, val));
        Arrays.sort(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 3, 4}, Arrays.copyOf(nums, 5));
    }
}
