package InterviewQuestion;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] customArray = {1, 2, 3, 4, 5};
        reverse(customArray);
    }

    static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int other = array.length-i-1;
            int temp = array[i];

            array[i] = array[other];
            array[other] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
//time complexity - O(n).
