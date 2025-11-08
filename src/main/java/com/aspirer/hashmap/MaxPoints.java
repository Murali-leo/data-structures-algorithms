package com.aspirer.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxPoints {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int maxPoints = 0;

        for(int i = 0; i < n - 1; i++) {
            int localMax = 0;
            Double slope = 0.0;
            Map<Double, Integer> slopeCount = new HashMap<>();
            for(int j = i + 1; j < n; j++) {
                if (points[i][0] == points[j][0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (double)((points[j][1] - points[i][1]) / (points[j][0] - points[i][0]));
                }
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
                localMax = Math.max(localMax, slopeCount.get(slope));
            }
            maxPoints = Math.max(maxPoints, localMax+1);
        }
        return maxPoints;
    }
}
