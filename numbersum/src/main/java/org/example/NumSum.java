package org.example;

public class NumSum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carriedForward = 0;
        ListNode prev = null;
        ListNode start = null;
        while (l1 != null || l2 != null || carriedForward != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }
            int currentSum = (digit1 + digit2 + carriedForward);
            int currVal = currentSum % 10;
            carriedForward = currentSum / 10;

            ListNode listNode = new ListNode(currVal);

            if (prev == null) {
                prev = listNode;
                start = prev;
            } else {
                prev.next = listNode;
                prev = listNode;
            }
        }
        return start;
    }

}
