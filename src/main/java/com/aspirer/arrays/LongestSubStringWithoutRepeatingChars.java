package com.aspirer.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            int currentLen = 0;
            Set<Character> unique = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(unique.add(s.charAt(j))) {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen);
                }
                else {
                    break;
                }
            }
        }
        return maxLen;
    }

    public int lengthOfLongestSubstringOptimal(String s) {
        int maxLen = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for(int right = 0; right < s.length(); right++) {

            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingChars obj = new LongestSubStringWithoutRepeatingChars();
        System.out.println(obj.lengthOfLongestSubstringOptimal("abcabcbb"));
        System.out.println(obj.lengthOfLongestSubstringOptimal("bbbbb"));
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
        System.out.println(obj.lengthOfLongestSubstring(" "));
        System.out.println(obj.lengthOfLongestSubstring("au"));
        System.out.println(obj.lengthOfLongestSubstringOptimal("dvdf"));
    }
}
