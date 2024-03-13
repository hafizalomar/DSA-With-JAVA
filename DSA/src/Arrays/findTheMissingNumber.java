package Arrays;

public class findTheMissingNumber {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        int array1sum = 0;
        int array2sum = 0;

        for (int i : array1) {
            array1sum += i;
        }
        for (int i : array2) {
            array2sum += i;
        }

        System.out.printf("Missing number is: %d", array1sum-array2sum);

    }
}
