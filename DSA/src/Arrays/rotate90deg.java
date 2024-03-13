package Arrays;

import java.util.Arrays;

public class rotate90deg {
    public static void main(String[] args) {
        int[][] customArray = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] result = rotate(customArray);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] rotate(int[][] array) {
        int n = array.length;
        int[][] sortArray = new int[n][n];
        for (int column = 0; column < 3; column++) {
            for (int row = n-1, j = 0; row >= 0; row--, j += 1) {
                sortArray[column][j] = array[row][column];
            }
        }
        return sortArray;
    }
}
