package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
//      if we enter 5 answer will be 64.95191;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hexagon arm length: ");
        double s = input.nextDouble();

        double hexagonArea = (6*Math.pow(s,2))/(4*Math.tan(3.1416/6));

        System.out.println("The area of hexagon: " + hexagonArea);
    }
}
