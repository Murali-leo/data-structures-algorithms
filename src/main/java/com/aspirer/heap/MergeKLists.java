package com.aspirer.heap;
/**
 * LeetCode Problem: MergeKLists
 * Problem Link: https://leetcode.com/problems/merge-k-sorted-lists/
*/ 
import java.util.PriorityQueue;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (ListNode listNode : lists) {
            if(listNode == null) continue;
            while (listNode.next != null) {
                heap.offer(listNode.val);
                listNode = listNode.next;
            }
            heap.offer(listNode.val);
        }

        if(heap.isEmpty()) return null;

        ListNode head = new ListNode(heap.poll());

        ListNode current = head;
        while (!heap.isEmpty()) {
            ListNode listnode = new ListNode(heap.poll());
            current.next = listnode;
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        MergeKLists mergeKLists = new MergeKLists();

        ListNode listNode1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = new ListNode[]{listNode1, listNode2, listNode3};

        ListNode mergedList = mergeKLists.mergeKLists(lists);

        // Print merged linked list
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}

class ListNode {
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
