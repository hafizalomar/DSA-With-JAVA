package Tree.BinaryTreeUsingArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree newTree = new BinaryTree(7);

        newTree.insert("1");
        newTree.insert("2");
        newTree.insert("3");
        newTree.insert("4");
        newTree.insert("5");
        newTree.insert("6");
        newTree.insert("7");

        newTree.preOder(1);
        System.out.println();
        newTree.inOder(1);
        System.out.println();
        newTree.postOder(1);
        System.out.println();
        newTree.levelOder();
        newTree.delete("3");
        newTree.levelOder();
    }
}
