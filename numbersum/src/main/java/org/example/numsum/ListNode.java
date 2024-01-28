package org.example.numsum;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String print() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        ListNode ln = this;
        do {
            sb.append(ln.val);
            ln = ln.next;
        } while (ln != null);
        sb.append("]");
        return sb.toString();
    }
}