package LinkedList.singlyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
//      this node is object and this Node is class.
        Node node = new Node();
        node.next = null;
        node.data = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeData, int location) {
        Node node = new Node();
        node.data = nodeData;

        if (head == null) {
            createSinglyLinkedList(nodeData);
            return;
        } else if (location == 0) {
//            this head mens head store those location.
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node newNode = tempNode.next;
            tempNode.next = node;
            node.next = newNode;
        }
        size++;
    }

    public void showLinkedListElement() {
        if (head == null) {
            System.out.println("LinkedList is empty.");
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public boolean searchNode(int data) {
        if (head == null) {
            System.out.println("LinkedList is empty, There is no element to search.");
        }
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == data) {
                System.out.print("We found the value in " + index + " index.");
                return true;
            }
            currentNode = currentNode.next;
            index++;
        }
        return false;
    }


//    for deleting the node.
    public void deleteLinkedListElement(int location) {
        if (head == null) {
            System.out.println("Singly linked list does not exist.");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

//    delete entire linked list;
    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
        System.out.println("Linked list is deleted successfully.");
    }
}
