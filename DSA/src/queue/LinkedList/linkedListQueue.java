package queue.LinkedList;

public class linkedListQueue {
    public Node head;
    public Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void enQueue(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int firstElement = head.data;
        head = head.next;
        return firstElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return head.data;
    }

    public void deleteQueue() {
        head = null;
        tail = null;
    }
}
