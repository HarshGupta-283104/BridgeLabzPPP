package Controlflow;

import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = src.nextInt();

        if (year >= 1582 && ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year.");
        } else {
            System.out.println("Year must be >= 1582 (Gregorian Calendar).");
        }

        src.close();
    }
}

