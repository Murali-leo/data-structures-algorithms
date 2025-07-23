/**
 * LeetCode Problem: LinkedListCycle
 * Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
 */
package com.aspirer.linkedlist.medium;

import com.aspirer.linkedlist.ListNode;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
