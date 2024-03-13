package LinkedList.circlarDoublyLinkedList;

public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Create Circular Linked List Method.
    public DoublyNode createCircularDoublyLinkedList(int value) {
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();

        node.data = value;
        head = node;
        tail = node;

        node.prev = node;
        node.next = node;
        size = 1;
        return head;
    }

    //insert element on circular doubly linked list method.
    public void insetElementOnCircularDoublyLinkedList(int value, int location) {
        DoublyNode node = new DoublyNode();
        node.data = value;

        if (head == null) {
            createCircularDoublyLinkedList(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head.prev = node;
            node.prev = tail;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.prev = tail;
            node.next = tail.next;
            head.prev = node;
            tail.next = node;
            tail = node;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            tempNode.next.prev = node;
        }
        size++;
    }

    //travers circular doubly linked list.
    public void traversCircularDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.data);
                if (i < size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list does not exist!");
        }
    }

    //travers circular doubly linked list reverse.
    public void traversCircularDoublyLinkedListInReverse() {
        if (head == null) {
            System.out.println("linked list does not exist!");
            return;
        }
        DoublyNode tempNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.data);
            if (i < size-1) {
                System.out.print(" <- ");
            }
            tempNode = tempNode.prev;
        }
        System.out.println();
    }

    // Search for a node.
    public void searchNodeFromCircularDoublyLinkedList(int value) {

        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.data == value) {
                    System.out.println("we found this value of index no = " + i);
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("we don't found this value in this circular doubly linked list.");
        } else {
            System.out.println("Circular linked list doe not exist!");
        }
    }

    // Delete circular doubly linked list node method.
    public void deleteNodeFromCircularDoublyLinkedList(int location) {
        if (head == null) {
            System.out.println("The circular doubly linked list does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            size--;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;
            size--;
        }
    }

    // Delete full circular doubly linked list.
    public void deleteFullCircularDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = head;
            int index = 0;

            while (index < size) {
                tempNode.prev = null;
                tempNode = tempNode.next;
                index++;
            }
            head = tail = null;
            System.out.println("Circular doubly linked list are successfully deleted.");
        } else {
            System.out.println("linked list does not exist!");
        }
    }
}
