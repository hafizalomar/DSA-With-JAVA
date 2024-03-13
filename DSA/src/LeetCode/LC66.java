package LeetCode;

import java.util.Arrays;

public class LC66 {
    public static void main(String[] args) {
        int[] numbers = {9};
        int[] result = plusOne(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int size = 0;
        if (digits[digits.length-1] == 9) {
            size += digits.length+1;
        }
        int[] result = new int[size];

        for (int i = digits.length; i >= 0; i++) {

        }
        return result;
    }
}
