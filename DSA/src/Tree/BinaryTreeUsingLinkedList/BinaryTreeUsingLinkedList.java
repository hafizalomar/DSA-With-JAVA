package Tree.BinaryTreeUsingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLinkedList {
    BinaryNode Root;

    public BinaryTreeUsingLinkedList() { // time complexity O(1) and Space complexity 0(1).
        this.Root = null;
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //PreOrder traversal -> [1][2][4][5][3][6][7].
    public void preOrder(BinaryNode node) { // time complexity O(N) and Space complexity 0(N).
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //InOrder traversal -> [4][2][5][1][6][3][7].
    public void inOrder(BinaryNode node) { // time complexity O(N) and Space complexity 0(N).
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.data + " -> ");
        inOrder(node.rightChild);
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //postOrder traversal -> [4][5][2][6][7][3][1].
    public void postOrder(BinaryNode node) { // time complexity O(N) and Space complexity 0(N).
        if (node == null) {
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.data + " -> ");
    }

    /*
        suffuse it's a binary tree.
                      [1]
                [2]         [3]
            [4]     [5] [6]     [7]

     */

    //levelOrder traversal -> [1][2][3][4][5][6][7].
    public void levelOrder() { // time complexity O(N) and Space complexity 0(N).
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();

        queue.add(Root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.data);
            if (presentNode != null) {
                System.out.print(" -> ");
            }
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }

        }
        System.out.println();
    }

    //Search node from Binary tree.
    public void searchNode(String value) { // time complexity O(N) and Space complexity 0(N).
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(Root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.data == value) {
                System.out.println("this value-" + value + " is found in tree.");
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("This value-" + value + " is not found is this tree.");
    }

    // Insert method.
    public void insertNode(String value) { // time complexity O(N) and Space complexity 0(N).
        BinaryNode node = new BinaryNode();
        node.data = value;

        if (Root == null) {
            Root = node;
            System.out.println("Root node value is inserted successfully in this tree.");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(Root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if (presentNode.leftChild == null) {
                presentNode.leftChild = node;
                System.out.println("Successfully inserted.");
                return;
            } else if (presentNode.rightChild == null) {
                presentNode.rightChild = node;
                System.out.println("Successfully inserted.");
                return;
            } else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }

    //Get deepest node.
    public BinaryNode getDeepestNode() { // time complexity O(N) and Space complexity 0(N).
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(Root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }

    //Delete node from tree.
    public void deleteNode() { // time complexity O(N) and Space complexity 0(N).
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(Root);
        BinaryNode previousNode, presentNode = null;

        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                previousNode.rightChild = null;
                return;
            } else if (presentNode.rightChild == null) {
                previousNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);
        }
    }

    //Delete given node.
    public void deleteGivenNode(String value) { // time complexity O(N) and Space complexity 0(N).
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(Root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.data == value) {
                presentNode.data = getDeepestNode().data;
                deleteNode();
                System.out.println("The node is deleted.");
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("The node exist on the binary tree.");
    }

    //Delete binary tree.
    public void deleteBinaryTree() { // time complexity O(1) and Space complexity 0(1).
        Root = null;
        System.out.println("The Binary tree is successfully deleted.");
    }
}
