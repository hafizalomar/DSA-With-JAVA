package queue.Array.linnerQueue;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(3);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);


        while (!newQueue.isEmpty()) {
            System.out.println(newQueue.peek());
            newQueue.deQueue();
        }
    }
}
