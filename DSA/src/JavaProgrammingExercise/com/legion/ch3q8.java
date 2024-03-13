package JavaProgrammingExercise.com.legion;

import java.util.Scanner;

public class ch3q8 {
    public static void main(String[] args) {
        int edge1, edge2, edge3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge: ");
        edge1 = input.nextInt();

        System.out.print("Enter second edge: ");
        edge2 = input.nextInt();

        System.out.print("Enter third edge: ");
        edge3 = input.nextInt();

        int temp1, temp2, temp3;

        if (edge1 > edge2 && edge1 > edge3){
            temp1 = edge1;
            temp2 = edge2;
            temp3 = edge3;
        } else if (edge2 > edge1 && edge2 > edge3){
            temp1 = edge2;
            temp2 = edge1;
            temp3 = edge3;
        } else {
            temp1 = edge3;
            temp2 = edge1;
            temp3 = edge2;
        }

        if (temp1 < temp2 + temp3) {
            System.out.println("Inputs are valid");
        } else {
            System.out.println("Input are invalid");
        }
    }
}
