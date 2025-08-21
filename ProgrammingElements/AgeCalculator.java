package ProgrammingElements;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter Harry's Birth Year: ");
        int birthYear = src.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = src.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + "is" + age);

        src.close();
    }
}
