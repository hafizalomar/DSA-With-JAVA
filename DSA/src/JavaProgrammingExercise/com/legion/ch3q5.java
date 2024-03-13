package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class ch3q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ax, Ay, Bx, By, Cx, Cy;

        System.out.print("Enter Ax value: ");
        Ax = input.nextDouble();

        System.out.print("Enter Ay value: ");
        Ay = input.nextDouble();

        System.out.print("Enter Bx value: ");
        Bx = input.nextDouble();

        System.out.print("Enter By value: ");
        By = input.nextDouble();

        System.out.print("Enter Cx value: ");
        Cx = input.nextDouble();

        System.out.print("Enter Cy value: ");
        Cy = input.nextDouble();

        double result = ((Ax * (By - Cy)) + (Bx * (Cy - Ay)) + (Cx * (Ay - By))) / 2;

        System.out.println("result = " + result);
    }
}
