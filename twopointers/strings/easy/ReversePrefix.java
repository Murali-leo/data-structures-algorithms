package twopointers.strings.easy;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        if(word == null || word.isEmpty()) {
            return word;
        }

        int characterFirstOccurence = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                characterFirstOccurence = i;
                break;
            }
        }
        return reverseString(word.toCharArray(), 0, characterFirstOccurence);
    }

     private static String reverseString(char[] charArray, int start, int end) {
        while(start < end) {
            char temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
        return new String(charArray);
    }
}
