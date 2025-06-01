package twopointers.strings.medium;

public class ReverseWords {
    public String reverseWords(String s) {

       char[] arr = s.trim().replaceAll("\\s+", " ").toCharArray();
       reverse(arr, 0, arr.length-1);
       
       int left = 0;
       int right = 0;

       while(right <= arr.length) {
            if(right == arr.length || arr[right] == ' ') {
                reverse(arr, left, right-1);
                left = right + 1;
            }
            right++;
       }

        return new String(arr);

    }

    public void reverse(char[] arr, int left, int right) {
        while(left <= right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
