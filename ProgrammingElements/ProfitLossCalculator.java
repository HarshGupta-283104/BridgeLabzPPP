package ProgrammingElements;

import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);

        System.out.print("Enter the selling price: ");
        double sellingPrice = src.nextDouble();

        System.out.print("Enter the cost price: ");
        double costPrice = src.nextDouble();

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit/costPrice)*100;

           System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
        src.close();
    }
}
