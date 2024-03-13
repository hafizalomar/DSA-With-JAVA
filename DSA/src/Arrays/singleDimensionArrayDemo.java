package Arrays;

public class singleDimensionArrayDemo {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);

        sda.insert(0, 0);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(12, 120);
        sda.insert(1, 12);

        System.out.println("Array Traversal:");
        sda.traversalArray();

        sda.searchInArray(110);
    }
}
