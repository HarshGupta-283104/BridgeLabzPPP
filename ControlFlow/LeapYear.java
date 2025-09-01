package Controlflow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = src.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian Calendar).");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (Multiple if-else).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (Multiple if-else).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (Multiple if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (Multiple if-else).");
            }
        }

        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year (Single if with logic).");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year (Single if with logic).");
        }

        src.close();
    }
}
