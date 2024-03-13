package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 6, 9};
        int[] result = TwoSum(intArray, 12);
        System.out.println(Arrays.toString(result));
    }

    public static int[] TwoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
