//Question no: 1.

public class addSumNumber {
    public static void main(String[] args) {
        int result = sumOfDigits(111);
        System.out.println(result);
    }

    public static int sumOfDigits(int n) {
        if (n == 0){
            return 0;
        }

        return n%10 + sumOfDigits(n/10);
    }
}
