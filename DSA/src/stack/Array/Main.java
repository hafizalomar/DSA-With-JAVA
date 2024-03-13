package stack.Array;

public class Main {
    public static void main(String[] args) {
        stack s1 = new stack(4);
        s1.push(1);
        s1.push(2);
        s1.push(5);
        s1.push(6);
        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
        s1.deleteStack();
    }
}
