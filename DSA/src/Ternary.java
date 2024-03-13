import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = input.nextByte();

        String ans = age < 18 ? "you are still kid" : "you are now adult.";

        System.out.println(ans);
    }
}
