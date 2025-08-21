package ProgrammingElements;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter distance in feets: ");
        double distance = src.nextDouble();

        double distanceInYards = distance/3;
        double distanceInMiles = distance/1760;

        System.out.println("The Distance in Yeads: "+ distanceInYards);
        System.out.println("The Distance in Miles: "+ distanceInMiles);

        src.close();
    }
}
