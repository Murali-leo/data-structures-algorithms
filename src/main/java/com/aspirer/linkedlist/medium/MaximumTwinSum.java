/**
 * LeetCode Problem: MaximumTwinSum
 * Problem Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
package com.aspirer.linkedlist.medium;

import com.aspirer.linkedlist.ListNode;

public class MaximumTwinSum {

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        int maxValue = 0;
        ListNode second = reverse(head);
        ListNode first = head;

        while(second != null) {
            maxValue = Math.max(maxValue, first.val + second.val);
            first = first.next;
            second = second.next;
        }

        return maxValue;
        
    }

    private ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode previous = null;

        while(current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }
}
