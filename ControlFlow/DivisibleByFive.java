package ControlFlow;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = src.nextInt();

        if(number %5 == 0){
            System.out.println("Is the number " + number + "divisible by 5? Yes.");
        }else{
            System.out.println("Is the number " + number + "divisible by 5? No.");
        }

        src.close();
    }
}
