package stack.LinkedList;

public class stack {
    public Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
