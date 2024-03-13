package Tree.BinaryTreeUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTreeUsingLinkedList BinaryTree = new BinaryTreeUsingLinkedList();

        BinaryTree.insertNode("1");
        BinaryTree.insertNode("2");
        BinaryTree.insertNode("3");
        BinaryTree.insertNode("4");
        BinaryTree.insertNode("5");
        BinaryTree.insertNode("6");
        BinaryTree.insertNode("7");
        BinaryTree.insertNode("8");
        BinaryTree.insertNode("9");

        BinaryTree.levelOrder();
        BinaryTree.deleteGivenNode("3");
        BinaryTree.levelOrder();


    }
}
