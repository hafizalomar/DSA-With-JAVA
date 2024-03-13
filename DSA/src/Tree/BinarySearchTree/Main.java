package Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        System.out.print("preOder traversal: ");
        bst.preOder(bst.root);
        System.out.println();
        System.out.print("inOder traversal: ");
        bst.inOder(bst.root);
        System.out.println();
        System.out.print("postOder traversal: ");
        bst.postOder(bst.root);
        System.out.println();
        System.out.print("levelOder traversal: ");
        bst.levelOder();
        System.out.println();
        bst.deleteNode(bst.root, 70);
        bst.levelOder();
    }
}
