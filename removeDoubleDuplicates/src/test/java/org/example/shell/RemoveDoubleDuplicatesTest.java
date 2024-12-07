package org.example.shell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDoubleDuplicatesTest {

    @Test
    void testApp() {
        int[] nums = {10, 10, 20, 20};
        int size = new RemoveDoubleDuplicates().removeDuplicates(nums);
        Assertions.assertEquals(4, size);
        System.out.printf("Got nums %s %n", Arrays.toString(nums));
        Assertions.assertArrayEquals(new int[]{10, 10, 20, 20}, Arrays.copyOf(nums, size));
    }

    @Test
    void testApp5Val() {
        int[] nums = {10, 11, 11, 11, 33, 44};
        int size = new RemoveDoubleDuplicates().removeDuplicates(nums);
        Assertions.assertEquals(5, size);
        System.out.printf("Copy nums %s %n", Arrays.toString(Arrays.copyOf(nums, size)));
        Assertions.assertArrayEquals(new int[]{10, 11, 11, 33, 44}, Arrays.copyOf(nums, size));
    }

    @Test
    void testApp1() {
        int[] nums = {10,10, 11, 11, 11, 12, 12, 13, 13, 13, 14};
        int size = new RemoveDoubleDuplicates().removeDuplicates(nums);
        Assertions.assertEquals(9, size);
        System.out.printf("Copy nums %s %n", Arrays.toString(Arrays.copyOf(nums, size)));
        Assertions.assertArrayEquals(new int[]{10, 10, 11, 11, 12, 12, 13, 13, 14}, Arrays.copyOf(nums, size));
    }
}
