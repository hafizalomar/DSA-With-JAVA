package queue.LinkedList;

public class Main {
    public static void main(String[] args) {
        linkedListQueue llq = new linkedListQueue();

        llq.enQueue(1);
        llq.enQueue(2);
        llq.enQueue(3);
        llq.deQueue();
        llq.deQueue();
        llq.enQueue(4);

        while (!llq.isEmpty()) {
            System.out.println(llq.peek());
            llq.deQueue();
        }
    }
}
