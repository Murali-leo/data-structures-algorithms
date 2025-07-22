/**
 * LeetCode Problem: MinimumToAddParanthesesValid
 * Problem Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */

package src.main.java.com.aspirer.stack.parantheses.medium;

import java.util.Stack;

public class MinimumToAddParanthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push('(');
                count++;
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                    count--;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * Without using extra space
     * 
     * public int minAddToMakeValid(String s) {
     * int cntopen=0;
     * int cntclose=0;
     * 
     * for(int i=0; i<s.length();i++){
     * 
     * if(s.charAt(i) == '(' ){
     * cntopen++;
     * }
     * else if(s.charAt(i) == ')'){
     * if(cntopen > 0){
     * cntopen--;
     * }
     * else {
     * cntclose++;
     * }
     * }
     * }
     * return cntopen+cntclose;
     * }
     */
}
