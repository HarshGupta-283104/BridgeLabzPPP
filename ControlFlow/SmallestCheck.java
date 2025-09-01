package Controlflow;

import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = src.nextInt();

        System.out.print("Enter number2: ");
        int num2 = src.nextInt();

        System.out.print("Enter number3: ");
        int num3 = src.nextInt();

        boolean isSmallest = (num1<num2 && num1<num3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        src.close();
    }
}
