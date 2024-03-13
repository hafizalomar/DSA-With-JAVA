package stack.ArrayList;

import java.util.ArrayList;

public class stack {
    static ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty;

    public static boolean isEmpty() {
        return list.size() == -1;
    }

    public void push(int data) {
        list.add(data);
    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }

}
