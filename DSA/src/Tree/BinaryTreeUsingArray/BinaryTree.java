package Tree.BinaryTreeUsingArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) { //time complexity O(1) and space complexity O(N).
        this.arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("blank tree is created with size of " + size);
    }

    //array is full or not.
    public boolean isFull() { //time complexity 0(1) and space complexity O(N).
        return arr.length-1 == lastUsedIndex;
    }

    //insert method.
    public void insert(String value) { //time complexity 0(1) and space complexity O(1).
        if (!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Successfully inserted.");
        } else {
            System.out.println("Binary tree is full.");
        }
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //PreOrder traversal -> [1][2][4][5][3][6][7].

    //preOder traversal.
    public void preOder(int index) { //time complexity 0(N) and space complexity O(N).
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOder(index * 2);
        preOder(index * 2 + 1);
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //InOrder traversal -> [4][2][5][1][6][3][7].

    //inOder traversal.
    public void inOder(int index) { //time complexity 0(N) and space complexity O(N).
        if (index > lastUsedIndex) {
            return;
        }
        inOder(index * 2);
        System.out.print(arr[index] + " ");
        inOder(index * 2 + 1);
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //postOrder traversal -> [4][5][2][6][7][3][1].

    //postOder traversal

    public void postOder(int index) { //time complexity 0(N) and space complexity O(N).
        if (index > lastUsedIndex) {
            return;
        }
        postOder(index * 2);
        postOder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //levelOrder traversal -> [1][2][3][4][5][6][7].

    //levelOder traversal.

    public void levelOder() { //time complexity 0(N) and space complexity O(1).
        for (int i = 1; i <= lastUsedIndex ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //search methode.

    public int search(String value) { //time complexity 0(N) and space complexity O(1).
        for (int i = 1; i <= lastUsedIndex ; i++) {
            if (arr[i] == value) {
                System.out.println("value is found on this tree.");
                return i;
            }
        }
        System.out.println("value is not found in this tree");
        return -1;
    }

    //Delete method.
    public void delete(String value) { // time complexity O(N) and Space complexity 0(1).
        int location = search(value);

        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("the node successfully deleted.");
        }
    }

    //Delete binary tree.
    public void deleteBinaryTree() { // time complexity O(1) and Space complexity 0(1).
        try {
            arr = null;
            System.out.println("Binary tree is successfully deleted.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
