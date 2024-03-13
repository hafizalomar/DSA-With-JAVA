package LinkedList.doublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDoublyLinkedList(int nodeValue) {
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.data = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert element on doubly linked list method.
    public void insertElementOnDoublyLinkedList(int value, int location) {
        DoublyNode node = new DoublyNode();
        node.data = value;
        if (head == null) {
            createDoublyLinkedList(value);
        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
            size++;
        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.prev = node;
            size++;
        }
    }


    //travers doubly linked list.
    public void traversDoublyLinkedList() {
        if (head == null) {
            System.out.println("Doubly linked list are empty!");
            return;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < size) {
                System.out.print(tempNode.data);
                if (index < size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
                index++;
            }
        }
        System.out.println();
    }

    //travers doubly linked list reverse.
    public void traversDoublyLinkedListReverse() {
        if (tail == null) {
            System.out.println("Doubly linked list are empty!");
            return;
        } else {
            DoublyNode tempNode = tail;
            int index = 0;
            while (index < size) {
                System.out.print(tempNode.data);
                if (index < size-1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
                index++;
            }
        }
        System.out.println();
    }

    // Search element from doubly linked list method.
    public void searchElementFromDoublyLinkedList(int searchValue) {
        if (head == null) {
            System.out.println("Doubly linked list are empty!");
            return;
        } else {
            DoublyNode tempNode = head;

            int index = 0;
            while (index < size) {
                if (tempNode.data == searchValue) {
                    System.out.println("Search item in index no: " + index);
                    return;
                }
                tempNode = tempNode.next;
                index++;
            }
            System.out.println("Search item is not found in doubly linked list.");
        }
        System.out.println();
    }

    // Deletion method.
    public void deleteNodeFromDoublyLinkedList(int location) {
        if (head == null) {
            System.out.println("Doubly linked list are empty!");
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } else if (location >= size) {
            /*

            DoublyNode tempNode = head;

            int index = 0;
            while (index < size -1) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

             */
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } else {
            int index = 0;
            DoublyNode tempNode = head;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next.prev = tempNode.prev;
            tempNode.prev.next = tempNode.next;
            size--;
        }
    }

    //Delete entire doubly linked list.
    public void deleteEntireDoublyLinkedList() {
        if (head == null) {
            System.out.println("Doubly linked list are empty!");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("Doubly linked list are has been deleted.");
        }
    }
}
