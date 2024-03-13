package Tree.AVL_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    // Constructor
    public AVL() {
        root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.leftChildren);
        preOrder(node.rightChildren);
    }

    // Inorder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.leftChildren);
        System.out.print(node.value + " ");
        inOrder(node.rightChildren);


    }

    // PostOrder Traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.leftChildren);
        postOrder(node.rightChildren);
        System.out.print(node.value + " ");
    }

    // Level Order

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.leftChildren != null) {
                queue.add(presentNode.leftChildren);
            }
            if (presentNode.rightChildren != null) {
                queue.add(presentNode.rightChildren);
            }
        }
    }

    // Search Method
    BinaryNode search(BinaryNode node, int value) {
        if (node == null ) {
            System.out.println("Value: "+ value+ " not found in AVL");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: "+ value+ " found in AVL");
            return node;
        } else if (value < node.value) {
            return search(node.leftChildren, value);
        } else {
            return search(node.rightChildren, value);
        }
    }

    //get height.
    public int getHeight(BinaryNode node) { //time and space complexity O(1).
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    //rotate right.
    private BinaryNode rotateRight(BinaryNode imbalancedNode) { //time and space complexity O(1).
        BinaryNode newRoot = imbalancedNode.leftChildren;
        imbalancedNode.leftChildren = imbalancedNode.leftChildren.rightChildren;
        newRoot.rightChildren = imbalancedNode;
        imbalancedNode.height = 1 + Math.max(getHeight(imbalancedNode.leftChildren), getHeight(imbalancedNode.rightChildren));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChildren), getHeight(newRoot.rightChildren));
        return newRoot;
    }

    //rotate left.
    private BinaryNode rotateLeft(BinaryNode imbalancedNode) { //time and space complexity O(1).
        BinaryNode newRoot = imbalancedNode.rightChildren;
        imbalancedNode.rightChildren = imbalancedNode.rightChildren.leftChildren;
        newRoot.leftChildren = imbalancedNode;
        imbalancedNode.height = 1 + Math.max(getHeight(imbalancedNode.leftChildren), getHeight(imbalancedNode.rightChildren));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChildren), getHeight(newRoot.rightChildren));
        return newRoot;
    }

    //get Balance.
    public int getBalance(BinaryNode node) { //time and space complexity O(1).
        if (node == null) {
            return 0;
        }
        return getHeight(node.leftChildren) - getHeight(node.rightChildren);
    }

    // insetNode method.
    private BinaryNode insertNode(BinaryNode node, int nodeValue) { //time and space complexity O(logN).
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (node.value > nodeValue) {
            node.leftChildren = insertNode(node.leftChildren, nodeValue);
        } else {
            node.rightChildren = insertNode(node.rightChildren, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.leftChildren), getHeight(node.rightChildren));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.leftChildren.value) {
            return rotateRight(node);
        }

        if (balance > 1 && nodeValue > node.leftChildren.value) {
            node.leftChildren = rotateLeft(node.leftChildren);
            return rotateRight(node);
        }

        if (balance < -1 && nodeValue > node.rightChildren.value) {
            return rotateLeft(node);
        }

        if (balance < -1 && nodeValue < node.rightChildren.value) {
            node.rightChildren = rotateRight(node.rightChildren);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int value) { //time and space complexity O(1).
        root = insertNode(root, value); //time and space complexity O(logN).
    }

    //minimum node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.leftChildren == null) {
            return root;
        }
        return minimumNode(root.leftChildren);
    }

    //delete node
    /*

    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value is not found in AVL Tree");
            return node;
        }
        if (value < node.value) {
            node.leftChildren = deleteNode(node.leftChildren, value);
        } else if (value > node.value) {
            node.rightChildren = deleteNode(node.rightChildren, value);
        } else {
            if (node.leftChildren != null && node.rightChildren != null) {
                BinaryNode tempNode = node;
                BinaryNode minNodeForRight = minimumNode(tempNode.rightChildren);
                node.value = minNodeForRight.value;
                node.rightChildren = deleteNode(node.rightChildren, minNodeForRight.value);
            } else if (node.leftChildren != null) {
                node = node.leftChildren;
            } else if (node.rightChildren != null) {
                node = null;
            }
        }

        int balance = getBalance(node);
        if (balance > 1 && getBalance(node.leftChildren) >= 0) {
            return rotateRight(node);
        }
        if (balance > 1 && getBalance(node.leftChildren) < 0) {
            node.leftChildren = rotateLeft(node.leftChildren);
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.rightChildren) <= 0) {
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.rightChildren) > 0) {
            node.rightChildren = rotateRight(node.rightChildren);
            return rotateRight(node);
        }
        return node;
    }

     */
    public BinaryNode deleteNode(BinaryNode node, int value) { //time and space complexity O(logN).
        if (node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if (value < node.value) {
            node.leftChildren = deleteNode(node.leftChildren, value);
        } else if (value > node.value) {
            node.rightChildren = deleteNode(node.rightChildren, value);
        } else {
            if (node.leftChildren != null && node.rightChildren != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.rightChildren);
                node.value = minNodeForRight.value;
                node.rightChildren = deleteNode(node.rightChildren, minNodeForRight.value);
            } else if (node.leftChildren != null) {
                node = node.leftChildren;
            } else if (node.rightChildren != null) {
                node = node.rightChildren;
            } else {
                node = null;
            }
        }
        // Case 2 - rotation required

        // System.out.println("1");
        // System.out.println(previous.value);

        // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.leftChildren) >= 0) {
            return rotateRight(node);
        }
        if (balance > 1 && getBalance(node.leftChildren) < 0) {
            node.leftChildren = rotateLeft(node.leftChildren);
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.rightChildren) <= 0) {
            return rotateLeft(node);
        }

        if (balance < -1 && getBalance(node.rightChildren) > 0) {
            node.rightChildren = rotateRight(node.rightChildren);
            return rotateLeft(node);
        }

        return node;

    }

    //delete.
    public void delete(int value) {
        root = deleteNode(root, value);
    }

    //delete avl tree.
    public void deleteAVL() { //time and space complexity O(1).
        root = null;
        System.out.println("AVL tree is successfully deleted.");
    }
}
