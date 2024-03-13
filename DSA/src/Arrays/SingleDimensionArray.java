package Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Value is successfully inserted.");
            } else {
                System.out.println("This cell is already occupied and value is: " + arr[location]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
//  array traversal.
    public void traversalArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//  Search for an element in the given array.

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("value is found in index: " + i);
                return;
            }
        }
        System.out.println("value is not found.");
    }
}
