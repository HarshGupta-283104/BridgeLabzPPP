package ProgrammingElements;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the hight of the triangel: ");
        double height = src.nextDouble();

        System.out.print("Enter the base of the triangle: ");
        double base =src.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println("The area of the triangle with base " + base + " inches and height " +
                           height + " inches is " + areaInSqInches + " square inches " +
                           " and " + areaInSqCm + " square centimeters.");

        src.close();
    }
}
