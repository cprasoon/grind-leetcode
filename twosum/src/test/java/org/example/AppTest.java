package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void twoSumCheck1() {
        int[] vals = {3, 2, 4, 10, 24};
        int target = 14;
        int[] result = new App().twoSum(vals, target);
        Assertions.assertEquals(result[0], 2);
        Assertions.assertEquals(result[1], 3);
    }

    @Test
    void twoSumCheck2() {
        int[] vals = {2,7,11,15};
        int target = 9;
        int[] result = new App().twoSum(vals, target);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);
    }

    @Test
    void twoSumCheck3() {
        int[] vals = {};
        int target = 2;
        int[] result = new App().twoSum(vals, target);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 0);
    }
}