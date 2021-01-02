package com.ggjjl1.leetcode;

public class ReorderList {
    public static class ListNode {
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
    }

    public static void reorderList(ListNode head) {
        ListNode p = head;
        int length = 0;
        while (p != null) {
            length = length + 1;
            p = p.next;
        }
    }
}
