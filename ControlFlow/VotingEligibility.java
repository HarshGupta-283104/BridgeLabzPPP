package Controlflow;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the current age: ");
        int age = src.nextInt();

        if(age >= 18){
            System.out.println("The person's age is" + age + "and can vote.");
        }else{
            System.out.println("The person's age is " + age + "and can't vote.");
        }

        src.close();
    }
}
