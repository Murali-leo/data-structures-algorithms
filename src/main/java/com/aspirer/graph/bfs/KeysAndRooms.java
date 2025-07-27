package com.aspirer.graph.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    boolean[] visited;
    public boolean canVisitAllRoomsUsingBFS(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rooms.get(0));
        while(!queue.isEmpty()) {
            List<Integer> room = queue.poll();
            for(Integer keys : room) {
                System.out.println("Print keys >> " + keys);
                if(!visited[keys]) {
                    System.out.println("room visited >> "+visited[keys]);
                    visited[keys] = true;
                    queue.add(rooms.get(keys));
                }
            }
        }
        for(boolean roomCheck : visited) {
            if(!roomCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms, 0);
        for(boolean roomCheck : visited) {
            if(!roomCheck) {
                return false;
            }
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, int ind) {
        for(Integer key : rooms.get(ind)) {
            if(!visited[key]) {
                visited[key] = true;
                dfs(rooms, key);
            }
        }
    }
}
