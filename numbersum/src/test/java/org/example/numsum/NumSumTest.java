package org.example.numsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.numsum.Helper.getList;

class NumSumTest {

    @Test
    void addTwoNumbers5() {
        int[] first = {9, 9, 9, 9};
        int[] second = {9, 9, 9, 9, 9, 9, 9};
        ListNode l1 = getList(first);
        ListNode l2 = getList(second);
        ListNode sum = new NumSum().addTwoNumbers(l1, l2);
        System.out.println("L1: " + l1.print());
        System.out.println("L2: " + l2.print());
        String sumPrint = sum.print();
        System.out.println("SUM: " + sumPrint);
        Assertions.assertEquals("[89990001]", sumPrint);
    }

    @Test
    void addTwoNumbers4() {
        int[] first = {0};
        int[] second = {0};
        ListNode l1 = getList(first);
        ListNode l2 = getList(second);
        ListNode sum = new NumSum().addTwoNumbers(l1, l2);
        System.out.println("L1: " + l1.print());
        System.out.println("L2: " + l2.print());
        String sumPrint = sum.print();
        System.out.println("SUM: " + sumPrint);
        Assertions.assertEquals("[0]", sumPrint);
    }

    @Test
    void addTwoNumbers3() {
        int[] first = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] second = {9};
        ListNode l1 = getList(first);
        ListNode l2 = getList(second);
        ListNode sum = new NumSum().addTwoNumbers(l1, l2);
        System.out.println("L1: " + l1.print());
        System.out.println("L2: " + l2.print());
        String sumPrint = sum.print();
        System.out.println("SUM: " + sumPrint);
        Assertions.assertEquals("[01000000000000001]", sumPrint);
    }

    @Test
    void addTwoNumbers2() {
        int[] first = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] second = {5, 6, 4};
        ListNode l1 = getList(first);
        ListNode l2 = getList(second);
        ListNode sum = new NumSum().addTwoNumbers(l1, l2);
        System.out.println("L1: " + l1.print());
        System.out.println("L2: " + l2.print());
        String sumPrint = sum.print();
        System.out.println("SUM: " + sumPrint);
        Assertions.assertEquals("[6640000000000000000000000000001]", sumPrint);
    }

    @Test
    void addTwoNumbers1() {
        int[] first = {2, 3, 4};
        int[] second = {5, 6, 4};
        ListNode l1 = getList(first);
        ListNode l2 = getList(second);
        ListNode sum = new NumSum().addTwoNumbers(l1, l2);
        System.out.println("L1: " + l1.print());
        System.out.println("L2: " + l2.print());
        String sumPrint = sum.print();
        System.out.println("SUM: " + sumPrint);
        Assertions.assertEquals("[798]", sumPrint);
    }
}