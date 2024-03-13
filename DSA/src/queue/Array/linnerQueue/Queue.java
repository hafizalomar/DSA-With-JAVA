package queue.Array.linnerQueue;

public class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Liner Queue is successfully created...");
    }

    public boolean isFull() {
        return topOfQueue == arr.length-1;
    }

    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("this " + data + " is successfully inserted to index no: " + topOfQueue);
        } else {
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("this " + data + " is successfully inserted to index no: " + topOfQueue);
        }
    }
    
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;

            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }

            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("Queue is successfully deleted!");
    }

}
