package com.features.leetcode.medium;

import com.features.leetcode.easy.ListNode;
import com.features.leetcode.easy.TwoNumberListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoNumberListTreeNodeTest {


    @Test
    void addTwNumbers_shouldReturnSimpleResult_whenL1AndL2hadOneEntry() {

        // GIVEN
        TwoNumberListNode twoNumberListNode = new TwoNumberListNode();

        ListNode l1 = new ListNode(2, new ListNode(4));
        ListNode l2 = new ListNode(5, new ListNode(3));

        ListNode expectedListResult = new ListNode(7);

        // WHEN
        ListNode resultListNode = twoNumberListNode.addTwNumbers(l1, l2);

        // THEN
        Assertions.assertEquals(resultListNode.getVal(), 7);
        Assertions.assertEquals(resultListNode.getNextNode().getVal(), 7);
    }

    @Test
    void addTwNumbers_shouldReturnResult_whenL1hasSameLengthToL2() {

        // GIVEN
        TwoNumberListNode twoNumberListNode = new TwoNumberListNode();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(2)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expectedListResult = new ListNode(7, new ListNode(0, new ListNode(8)));

        // WHEN
        ListNode resultListNode = twoNumberListNode.addTwNumbers(l1, l2);

        // THEN
        Assertions.assertEquals(resultListNode.getVal(), 7);
        Assertions.assertEquals(resultListNode.getNextNode().getVal(), 0);
        Assertions.assertEquals(resultListNode.getNextNode().getNextNode().getVal(), 8);
        Assertions.assertEquals(resultListNode, expectedListResult);
    }
}
