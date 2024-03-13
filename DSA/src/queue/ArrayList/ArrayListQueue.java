package queue.ArrayList;

import java.util.ArrayList;

public class ArrayListQueue {
    static ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty;

    public static boolean isEmpty() {
        return list.size() == -1;
    }

    public void enQueue(int data) {
        list.add(data);
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int firstElement = list.get(0);
        list.remove(0);
        return firstElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return list.get(0);
    }

    public void traversQueue() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
