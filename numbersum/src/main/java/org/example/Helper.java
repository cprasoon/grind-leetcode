package org.example;

import java.util.ArrayList;

public class Helper {
    public static ListNode getList(int[] arr) {
        ArrayList<ListNode> list = new ArrayList<>();
        for (int i = arr.length; i > 0; i--) {

            if (i == arr.length) {
                ListNode n = new ListNode(arr[i - 1]);
                list.add(0, n);
            }
            if (i != arr.length) {
                ListNode n = new ListNode(arr[i - 1], list.get(0));
                list.add(0, n);
            }
        }
        return list.get(0);
    }
}
