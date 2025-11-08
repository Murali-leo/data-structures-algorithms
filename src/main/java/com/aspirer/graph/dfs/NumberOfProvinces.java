package com.aspirer.graph.dfs;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int numberOfProvinces = 0;
        int numberOfCities = isConnected.length;
        boolean[] visited = new boolean[numberOfCities];
        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                dfs(isConnected, visited, i);
                numberOfProvinces++;
            }
        }
        return numberOfProvinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;
        for(int j = 0; j < isConnected.length; j++) {
            if(isConnected[city][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
