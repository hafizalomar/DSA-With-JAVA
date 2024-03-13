package stack.LinkedList;

public class Main {
    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
