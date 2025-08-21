package ProgrammingElements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the num1: ");
        double num1 = src.nextDouble();

        System.out.print("Enter the num2: ");
        double num2 = src.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1* num2;
        double division = num1 / num2;

        if(num2 != 0 ){
            division = num1 / num2;
        }else{
            System.out.println("Division not possible becaue denominator is zero.");
        }
        
        System.out.println("The addition, subtraction, multiplication and division " +
                           "value of 2 numbers " + num1 + " and " + num2 + " is " +
                           addition + ", " + subtraction + ", " + multiplication +
                           ", and " + division);
        src.close();

    }
}
