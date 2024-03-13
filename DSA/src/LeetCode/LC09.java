package LeetCode;

import java.util.Arrays;

public class LC09 {
    public static void main(String[] args) {
        boolean result = isPalindrome(10);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String intToStr = Integer.toString(x);
        char[] ch = intToStr.toCharArray();
        System.out.println(Arrays.toString(ch));
        int chL = ch.length;
        for (int i = 0; i < chL; i++) {
            if (ch[i] == ch[chL-1]){
                chL--;
            } else {
                return false;
            }
        }
        return true;
    }
}
