package queue.Array.circularQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Queue newCircularQueue = new Queue(4);
        newCircularQueue.enQueue(1);
        newCircularQueue.enQueue(2);
        newCircularQueue.enQueue(3);
        newCircularQueue.enQueue(4);
        newCircularQueue.deQueue();
        newCircularQueue.enQueue(5);

        while (!newCircularQueue.isEmpty()) {
            System.out.println(newCircularQueue.peek());
            newCircularQueue.deQueue();
        }
    }
}
