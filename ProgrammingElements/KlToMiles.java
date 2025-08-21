package ProgrammingElements;

import java.util.Scanner;

public class KlToMiles {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter distance in Kilometer: ");
        double km = src.nextDouble();

        double milesPerKm = 1.6;
        double miles = km*milesPerKm;

        System.out.println("The Distance " + km  + "km in miles is " + miles );
        src.close();
    }
}
