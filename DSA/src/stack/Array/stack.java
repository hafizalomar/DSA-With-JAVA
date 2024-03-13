package stack.Array;

import java.util.Arrays;

public class stack {
    int[] arr;
    int topOfStack;

    public stack (int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("This stack is created with size of: " + size);
    }

    //Is Empty.
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    //Is Full;
    public boolean isFull() {
        return topOfStack == arr.length-1;
    }

    //push method;
    public void push(int value) {
        if (isFull()){
            System.out.println("stack is full");
        } else {
            topOfStack++;
            arr[topOfStack] = value;
            System.out.println("Value is successfully inserted.");
        }
    }

    //pop method;
    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is empty we can't pop from hear and out.");
            return -1;
        } else {
            int value = arr[topOfStack];
            topOfStack--;
            return value;
        }
    }

    //peek method;
    public int peek() {
        int value = arr[topOfStack];
        return value;
    }

    //delete stack;
    public void deleteStack() {
        arr = null;
        System.out.println("stack is successfully deleted.");
    }
}
