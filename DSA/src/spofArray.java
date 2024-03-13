public class spofArray {
    public static void main(String[] args) {
        int[] customArray = {1, 2, 3, 4, 5};
        spofArray(customArray);
    }

    static void spofArray(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

        System.out.printf("sum = %d, multi = %d",sum, product);
    }
}
