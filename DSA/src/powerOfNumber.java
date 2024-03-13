public class powerOfNumber {
    public static void main(String[] args) {
        int result = power(2, 4);
        System.out.println(result);
    }

    public static int power(int base, int exp) {
        if (exp == 0 || exp == 1){
            return base;
        }
        return base * power(base, exp - 1);
    }
}
