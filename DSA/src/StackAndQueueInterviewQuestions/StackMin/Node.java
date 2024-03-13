package StackAndQueueInterviewQuestions.StackMin;

public class Node {
    int data;
    Node next;

    Node nextMin;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.nextMin = null;
    }
}
