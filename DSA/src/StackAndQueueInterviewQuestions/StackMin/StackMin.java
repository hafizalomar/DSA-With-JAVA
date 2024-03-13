package StackAndQueueInterviewQuestions.StackMin;

public class StackMin {
    public Node head;
    public Node tail;
    public Node min;

    public boolean isEmpty() {
        return head == null;
    }
    public void push(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            tail = node;
            min = node;
            return;
        }
        node.next = head;
        head = node;
        if (min.data > head.data) {
            node.nextMin = min;
            min = node;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty.");
            return -1; // Or throw an exception indicating underflow
        }
        int top = head.data;
        if (head == min) {
            min = head.nextMin; // Update min if the popped node is the minimum node
        }
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public void delete() {
        head = null;
        tail = null;
        min = null;
    }

    public int min() {
        return min.data;
    }

}
