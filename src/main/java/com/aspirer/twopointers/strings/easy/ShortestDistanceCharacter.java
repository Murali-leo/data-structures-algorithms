/**
 * LeetCode Problem: ShortestDistanceCharacter
 * Problem Link: https://leetcode.com/problems/shortest-distance-to-a-character/
 */
package src.main.java.com.aspirer.twopointers.strings.easy;

public class ShortestDistanceCharacter {

    public int[] shortestToChar(String s, char c) {

        int len = s.length();
        int[] result = new int[len];
        int c_position = -len;

        for(int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                c_position = i;
            }
            result[i] = i - c_position;
        }

        for(int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                c_position = i;
            }
            result[i] = Math.min(result[i], Math.abs(i - c_position));
        }

        return result;
        
        /*
         * int len = s.length();

        // Step 1: Get list of all positions where character c occurs
        List<Integer> charPositions = IntStream.range(0, len)
                .filter(i -> s.charAt(i) == c)
                .boxed()
                .collect(Collectors.toList());

        // Step 2: Use streams to compute minimum distance to any position of c
        return IntStream.range(0, len)
                .map(i -> charPositions.stream()
                        .mapToInt(pos -> Math.abs(i - pos))
                        .min()
                        .orElse(len)) // fallback in case charPositions is empty
                .toArray();
         */
    }
}
