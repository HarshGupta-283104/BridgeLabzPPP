package ProgrammingElements;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter value a: ");
        int a = src.nextInt();

        System.out.print("Enter value b: ");
        int b = src.nextInt();

        System.out.print("Enter value c: ");
        int c = src.nextInt();

        int op1 = a + b *c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + op1);
        System.out.println("a * b + c = " + op2);
        System.out.println("c + a / b = " + op3);
        System.out.println("a % b + c = " + op4);

        src.close();
    }
}
