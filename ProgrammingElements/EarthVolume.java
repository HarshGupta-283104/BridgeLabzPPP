package ProgrammingElements;

import java.util.Scanner;

public class EarthVolume {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the radius of the earth: ");
        double radiusKm = src.nextDouble();
        double volumeKm = (4.0/3.0)*Math.PI*Math.pow(radiusKm,3);

        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
    
        System.out.printf("The volume of Earth in cubic kilometers is %.2f%n", volumeKm);
        System.out.printf("The volume of Earth in cubic miles is %.2f%n", volumeMiles);

        src.close();
    }
}
