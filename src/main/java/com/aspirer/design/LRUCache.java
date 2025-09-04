/**
 * LeetCode Problem: LRUCache
 * Problem Link: https://leetcode.com/problems/lru-cache/
*/ 
package com.aspirer.design;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }
}

public class LRUCache {

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int limit = 0;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        int value = map.get(key).value;

        Node node = map.get(key);
        deleteNode(node);
        addToHead(node);

        return value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node olNode = map.get(key);
            deleteNode(olNode);
            map.remove(key);
        }

        if (map.size() == limit) {
            Node lruNode = tail.prev;
            deleteNode(lruNode);
            map.remove(lruNode.key);
        }

        Node newNode = new Node(key, value);
        addToHead(newNode);
        map.put(key, newNode);
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }
}
