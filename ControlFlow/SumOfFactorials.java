package Controlflow;
import java.util.*;

public class SumOfFactorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sumOfFactorials = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += factorial(digit);
            tempNumber /= 10;
        }

        System.out.println("The sum of the factorials of the digits of " + number + " is: " + sumOfFactorials);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
