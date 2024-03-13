public class GCD {
    public static void main(String[] args) {
        int result = gcd(8, 12);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
