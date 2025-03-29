package com.features.leetcode.easy.mergetwosortedlist;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxIntegerSequenceTest {

    Solution solution = new Solution();

    private Stream<Object[]> provideListsForMerge() {
        return Stream.of(
                new Object[]{
                        null,
                        null,
                        new int[]{}
                },
                new Object[]{
                        createList(1, 2, 3, 4),
                        null,
                        new int[]{1, 2, 3, 4}},
                new Object[]{
                        null,
                        createList(1, 2, 3, 4),
                        new int[]{1, 2, 3, 4}},
                new Object[]{
                        createList(1, 3, 5),
                        createList(2, 4, 6),
                        new int[]{1, 2, 3, 4, 5, 6}},
                new Object[]{
                        createList(1, 3, 5),
                        createList(2, 4, 6, 7, 9),
                        new int[]{1, 2, 3, 4, 5, 6, 7, 9}},
        new Object[]{
                createList(1, 1, 2),
                createList(2, 2, 6),
                new int[]{1, 1, 2, 2, 2, 6}});
    }

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private void assertListEquals(ListNode head, int... expectedValues) {
        ListNode current = head;
        for (int value : expectedValues) {
            assertNotNull(current, "La liste est plus courte que prévu.");
            assertEquals(value, current.val, "La valeur du nœud ne correspond pas.");
            current = current.next;
        }
        assertNull(current, "La liste est plus longue que prévu.");
    }

    @ParameterizedTest
    @MethodSource("provideListsForMerge")
    void mergeTwoLists_shouldReturnCorrectMergedList(ListNode l1, ListNode l2, int[] expectedValues) {

        // GIVEN
        // WHEN
        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // THEN
        assertListEquals(mergedList, expectedValues);

    }

}