package ControlFlow;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter the number: ");
        number = src.nextDouble();

        while(number != 0){
            total += number;
            System.out.print("Enter a number (enter 0 to stop): ");
            number =src.nextDouble();
        }
        System.out.println("The total sum is "+ total);
        src.close();
    }
}
