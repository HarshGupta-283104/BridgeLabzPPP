package ProgrammingElements;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the sides of Square: ");
        int side = src.nextInt();

        int perimeter = 4*side;
        int area = side*side;

        System.out.println("The perimeter of square: " + perimeter);
        System.out.println("The area of square: " + area);

        src.close();
    }
}
