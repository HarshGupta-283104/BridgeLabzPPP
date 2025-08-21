package ControlFlow;

import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the counter: ");
        int counter = src.nextInt();

        for(int i = counter;i>0;i--){
            System.out.println(i);
        }
        System.out.println("Rocket launch...");
        src.close();
    }
}
