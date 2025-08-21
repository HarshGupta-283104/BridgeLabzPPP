package ProgrammingElements;

import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter unit price(INR): ");
        double unitPrice = src.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = src.nextInt();

        double totalPrice = unitPrice*quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        src.close();
    }
}
