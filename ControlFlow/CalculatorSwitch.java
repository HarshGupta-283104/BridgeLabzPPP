package ControlFlow;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = src.nextDouble();

        System.out.print("Enter second number: ");
        double second = src.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = src.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }
        src.close();
    }
}
