package LinkedList.circularLinkedList;

public class circularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.data = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void InsertCllValue(int value, int location) {
        Node node = new Node();
        node.data = value;

        if (head == null) {
            createCircularLinkedList(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }


    // traversal method start.
    public void showCircularLinkedListElement() {
        if (head == tail) {
            System.out.println("LinkedList is empty.");
            return;
        }
        Node currentNode = head;
        int index = 0;
        while (index < size){
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
            index++;
        }
        System.out.println();
    }

    public void traverseLinkedList() {
        if (head != null) {
            Node tempNode = head;

            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.data);
                if (i < size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        } else {
            System.out.println("Circular linked list does not exist!");
        }
        System.out.println();
    }

    public void showCircularLinkedListElement2() {
        if (head == null) {
            System.out.println("LinkedList is empty.");
        }
        Node currentNode = head;
        while (currentNode != head){
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
    }
    // traversal method end.


    // Search method.
    public void searchCircularLinkedListValue(int value) {
        if (head == tail) {
            System.out.println("Circular Linked list is empty.");
        }
        Node currentNode = head;
        int index = 0;
        while (index < size) {
            if (currentNode.data == value) {
                System.out.print("index: " + index);
                return;
            }
            currentNode = currentNode.next;
            index++;
        }
        System.out.println("value is not found in circular linked list.");
    }


    //delete method.
    public void deleteElementFromCircularLinkedList(int location) {
        if (head == null) {
            System.out.println("The Circular linked list does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
                head.next = null;
            }
        } else if (location >= size) {
            Node tempNode = head;

            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }

            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }


    //Delete ent linked list.
    public void deleteEntLinedList() {
        if (head == null) {
            System.out.println("circular linked list does not exist!");
        } else {
            tail.next = null;
            head = null;
            tail = null;
            System.out.println("circular linked list has been deleted.");
        }
    }

}
