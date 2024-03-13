package stack.ArrayList;

public class Main {
    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
