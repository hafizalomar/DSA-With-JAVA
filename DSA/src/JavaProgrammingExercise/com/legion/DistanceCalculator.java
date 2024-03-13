package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        double distance, time;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        distance = input.nextDouble();

        System.out.print("Enter time in minutes: ");
        time = input.nextDouble();

        double timeInSecond = (time * 60);
        double distanceInKm = distance / 1000;

        double speed = distanceInKm / timeInSecond;

        System.out.printf("Speed is: %.2f km/s", speed);
    }
}
