package twopointers.strings.easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right) {
            char ch = s[left];
            s[left++] = s[right];
            s[right--] = ch;
        }
    }
}