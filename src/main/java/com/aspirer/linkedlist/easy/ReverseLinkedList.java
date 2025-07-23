/**
 * LeetCode Problem: ReverseLinkedList
 * Problem Link: https://leetcode.com/problems/reverse-linked-list/
 */
package com.aspirer.linkedlist.easy;

import com.aspirer.linkedlist.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
