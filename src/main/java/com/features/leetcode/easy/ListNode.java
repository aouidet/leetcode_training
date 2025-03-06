package com.features.leetcode.easy;

public class ListNode {
    private int val;
    private ListNode nextNode;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode nextNode) {
        this.val = val;
        this.nextNode = nextNode;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
}