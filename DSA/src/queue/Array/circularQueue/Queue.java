package queue.Array.circularQueue;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    //create circular queue.
    public Queue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Circular Queue is successfully created...");
    }

    //isFull method.
    public boolean isFull() {
        return beginningOfQueue == 0 && topOfQueue == arr.length-1 || topOfQueue == beginningOfQueue-1;
    }

    //isEmpty method.
    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    //enQueue method.
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Circular queue is full...");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("this " + data + " is successfully inserted to index no: " + topOfQueue);
        } else {
            if (topOfQueue == size-1) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = data;
            System.out.println("this " + data + " is successfully inserted to index no: " + topOfQueue);
        }
    }

    //deQueue method.
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                topOfQueue = beginningOfQueue = -1;
            } else if (beginningOfQueue+1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    //peek method.
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    //delete method.
    public void delete() {
        arr = null;
        System.out.println("queue is successfully deleted...");
    }
}
