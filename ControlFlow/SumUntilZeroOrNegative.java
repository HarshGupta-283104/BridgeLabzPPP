package ControlFlow;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double total=0.0;
        double number;

        System.out.print("Enter the number (enter 0 or negative number to stop): ");
        
        while(true){
            number = src.nextDouble();

            if(number<=0){
                break;
            }
            total += number;
        }
        System.out.println("total sum: " + total);
        src.close();
    }
}
