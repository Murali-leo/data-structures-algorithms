/**
 * LeetCode Problem: WateringPlants
 * Problem Link: https://leetcode.com/problems/watering-plants-ii/
 */

package src.main.java.com.aspirer.twopointers.arrays.medium;

public class WateringPlants {

    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int start = 0;
        int end = plants.length - 1;
        int aWater = capacityA;
        int bWater = capacityB;
        int refill = 0;

        while(start <= end) {
            // Both meet at the same plant
            if(start == end) {
                if(Math.max(aWater, bWater) < plants[start]) {
                    refill++;
                }
                break;
            }

            if(aWater < plants[start]) {
                refill++;
                aWater = capacityA;
            } 

            aWater -= plants[start];
            start++;

            if(bWater < plants[end]) {
                refill++;
                bWater = capacityB;
            }

            bWater -= plants[end];
            end--;
        }

        return refill;
    }
}
