package queue.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListQueue q1 = new ArrayListQueue();
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.deQueue();
        q1.enQueue(5);
        q1.traversQueue();


    }
}
