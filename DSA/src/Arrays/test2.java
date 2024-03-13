package Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i]+ ", " + array[j]);
            }
        }
    }
}
