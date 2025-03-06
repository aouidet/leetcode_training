package com.features.leetcode.easy;

public class TwoNumberListNode {

    public ListNode addTwNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        int value;
        int carry = 0;

        while (l1 != null && l2 != null) {

            value = l1.getVal() + l2.getVal() + carry;
            carry = value / 10;

            currentNode.setNextNode(new ListNode(value % 10));
            currentNode = currentNode.getNextNode();

           // increment next node
            l1 = l1.getNextNode();
            l2 = l2.getNextNode();

        }

        System.out.println(currentNode);
        return dummyHead.getNextNode();
    }

}
