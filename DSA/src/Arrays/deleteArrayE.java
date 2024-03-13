package Arrays;

import java.util.Arrays;

public class deleteArrayE {
    public static void main(String[] args) {
        int[] customArray = {1, 2, 3, 4, 5};
        deleteElement(customArray, 1);
    }

    public static void deleteElement(int[] array, int index) {
        for (int i = index; i < array.length; i++){
            if(i == array.length-1){
                break;
            }
            array[i] = array[i+1];
            array[i+1] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
