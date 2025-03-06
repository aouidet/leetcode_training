package com.features.leetcode.easy.mergetwosortedlist;

public class Solution {

    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // add list1
                list1 = list1.next; // increment list1
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // increment merged list
        }

        // adding the rest elements
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
