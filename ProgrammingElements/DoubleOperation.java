package ProgrammingElements;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = src.nextDouble();

        System.out.print("Enter value b: ");
        double b = src.nextDouble();

        System.out.print("Enter value c: ");
        double c = src.nextDouble();

        double op1 = a + b *c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + op1);
        System.out.println("a * b + c = " + op2);
        System.out.println("c + a / b = " + op3);
        System.out.println("a % b + c = " + op4);

        src.close();
    }
}
