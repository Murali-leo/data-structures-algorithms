/**
 * LeetCode Problem: LinkedListCycle
 * Problem Link: https://leetcode.com/problems/linked-list-cycle/
 */
package com.aspirer.linkedlist.easy;

import com.aspirer.linkedlist.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(fast == null || fast.next == null) {
            return false;
        }
        
        fast = fast.next;

        while(fast != null && fast.next != null) {
            if(fast != slow) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
