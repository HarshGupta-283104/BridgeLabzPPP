package ProgrammingElements;

import java.util.Scanner;

public class DistanceKmToMiles {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double km = 10.8;
        double milesPerKm = 1.6;

        double miles = km*milesPerKm;
        System.out.println("The Distance " + km  + "km in miles is " + miles );
        
        src.close();
    }
}
