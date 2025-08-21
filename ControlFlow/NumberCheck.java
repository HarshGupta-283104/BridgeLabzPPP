package ControlFlow;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = src.nextInt();

        if(num > 0){
            System.out.println("The given number " + num + "is positive.");
        }else if(num < 0){
            System.out.println("The given number " + num + "is negative.");
        }else{
            System.out.println("The given number is zero.");
        }

        src.close();
    }
}
