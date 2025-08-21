package ProgrammingElements;

import java.util.Scanner;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter course fee: ");
        int courseFee = src.nextInt();

        System.out.print("Enter discount percentage: ");
        int discountPercentage = src.nextInt();

        double discount = (courseFee*discountPercentage)/100;
        double discountAmount = courseFee-discount;

        System.out.println("The discount amount: " + discount);
        System.out.println("The discount fee to pay: " + discountAmount);

        src.close();
    
    }
}
