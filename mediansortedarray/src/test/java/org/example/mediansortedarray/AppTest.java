package org.example.mediansortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAppCase1() {
        Assertions.assertEquals(2.0, new App().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.0D);
    }

    @Test
    void testAppCase2() {
        Assertions.assertEquals(2.5, new App().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}),0.0D);
    }

    @Test
    void testAppCase3() {
        Assertions.assertEquals(4.0, new App().findMedianSortedArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7}),0.0D);
    }
}
