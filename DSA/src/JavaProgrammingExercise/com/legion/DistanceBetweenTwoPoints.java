package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double x1, x2, y1, y2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        y2 = input.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1ff) is : %.2f%n" ,x1, y1, x2, y2, distance);
    }
}
