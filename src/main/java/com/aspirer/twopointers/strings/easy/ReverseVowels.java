/**
 * LeetCode Problem: ReverseVowels
 * Problem Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

package com.aspirer.twopointers.strings.easy;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        List<Character> vowelList = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toCharArray();
        while(start < end) {
            if(vowelList.contains(charArray[start]) && 
                vowelList.contains(charArray[end])) {
                    char temp = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    start++;
                    end--;
                }
            else if (vowelList.contains(charArray[end])) {
                start++;
            } else if (vowelList.contains(charArray[start])) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        return new String(charArray);
    }
}
