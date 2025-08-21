package ControlFlow;

import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the counter: ");
        int counter = src.nextInt();

        while(counter >= 1){
            System.out.println(counter);
            counter--;
        }
        System.out.print("Liftoff....");

        src.close();
    }
}
