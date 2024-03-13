package Tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    //it's create a binary search tree.
    public BinarySearchTree() { //Time complexity O(1) and Space complexity O(1).
        this.root = null;
    }

    //Insert method.
    private BinaryNode insert(BinaryNode currentNode, int value) { //Time complexity O(logN) and Space complexity O(logN).
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.data = value;
            System.out.println("THE VALUE SUCCESSFULLY INSERTED.");
            return newNode;
        } else if (value <= currentNode.data) {
            currentNode.leftChild = insert(currentNode.leftChild, value);
            return currentNode;
        } else {
            currentNode.rightChild = insert(currentNode.rightChild, value);
            return currentNode;
        }
    }
    public void insert(int value) {
        root = insert(root, value); // Update the root after insertion
    }


    //preOder traversal.
    public void preOder(BinaryNode node) { //Time complexity O(N) and Space complexity O(N).
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        preOder(node.leftChild);
        preOder(node.rightChild);
    }

    //inOder traversal.
    public void inOder(BinaryNode node) { //Time complexity O(N) and Space complexity O(N).
        if (node == null) {
            return;
        }
        inOder(node.leftChild);
        System.out.print(node.data + " -> ");
        inOder(node.rightChild);
    }

    //postOder traversal.
    public void postOder(BinaryNode node) { //Time complexity O(N) and Space complexity O(N).
        if (node == null) {
            return;
        }
        postOder(node.leftChild);
        postOder(node.rightChild);
        System.out.print(node.data + " -> ");
    }

    //levelOder traversal.
    void levelOder() { //Time complexity O(N) and Space complexity O(N).
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.data + " -> ");
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }

    }

    //Search method.
    BinaryNode search(BinaryNode node, int value) { //Time complexity O(logN) and Space complexity O(logN).
        if (node == null) {
            System.out.println("value is not found!");
            return null;
        } else if (node.data == value) {
            System.out.println("value is found!");
            return node;
        } else if (value < node.data) {
            return search(node.leftChild, value);
        } else {
            return search(node.rightChild, value);
        }
    }

    //minimum node method.
    public static BinaryNode minNode(BinaryNode root) {
        if (root.leftChild == null) {
            return root;
        } else {
            return minNode(root.leftChild);
        }
    }

    //delete node method.
    public BinaryNode deleteNode(BinaryNode root, int value) { //Time complexity O(logN) and Space complexity O(logN).
        if (root == null) {
            System.out.println("value is not found is this BST");
            return null;
        }
        if (value < root.data) {
            root.leftChild = deleteNode(root.leftChild, value);
        } else if (value > root.data) {
            root.rightChild = deleteNode(root.rightChild, value);
        } else {
            if (root.leftChild != null && root.rightChild != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minNode(temp.rightChild);
                root.data = minNodeForRight.data;
                root.rightChild = deleteNode(root.rightChild, minNodeForRight.data);
            } else if (root.leftChild != null ){
                root = root.leftChild;
            } else if (root.rightChild != null) {
                root = root.rightChild;
            } else {
                root = null;
            }
        }
        return root;
    }

    //delete full binary search tree.
    public void deleteBinarySearchTree() { //Time complexity O(1) and Space complexity O(1).
        root = null;
        System.out.println("Binary Search tree is successfully deleted.");
    }
}
