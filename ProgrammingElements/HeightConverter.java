package ProgrammingElements;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the hight in centimeters: ");
        double height = src.nextDouble();

        double totalInches =height/2.54;

        int feet = (int)(totalInches/12);
        double inches = totalInches % 12;

        System.out.println("Your height in cm is " + height +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));
        src.close();
    }
}
