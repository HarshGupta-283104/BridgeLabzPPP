package ProgrammingElements;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = src.nextInt();

        System.out.print("Enter num2: ");
        int num2 = src.nextInt();

       if (num2 != 0) {
            int division = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("The Quotient is " + division + 
                               " and Remainder is " + remainder + 
                               " of two numbers " + num1 + " and " + num2);
        } else {
            System.out.println("The denominator is zero. Division not possible.");
        }

        src.close();
    }
}
