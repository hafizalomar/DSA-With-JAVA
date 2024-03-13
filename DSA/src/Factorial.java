public class Factorial {
    public static void main(String[] args) {
        int result = factorialMethod(-2);
        System.out.println(result);
    }

    public static int factorialMethod(int n) {
        if(n < 1){
            System.out.println("you enter a negative values");
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialMethod(n - 1);
    }
}
