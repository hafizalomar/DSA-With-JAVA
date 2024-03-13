public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(0);
        fibonacci(0, 1);
    }

    static void fibonacci(int a, int b) {
        if (b > 10000) {
            return;
        }
        System.out.println(b);
        fibonacci(b, a+b);
    }
}
