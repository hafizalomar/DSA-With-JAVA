package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));
    }
}
