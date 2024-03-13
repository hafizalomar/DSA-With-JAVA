package Arrays;

import java.util.Scanner;

public class ArrayProject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many day's temperature? :");
        int days = input.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.printf("Day %d's high temp: ",i+1);
            temps[i] = input.nextInt();
            sum += temps[i];
        }

        System.out.println("Average: " + (sum/days));
    }
}
