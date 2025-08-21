package ProgrammingElements;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = src.nextInt();

        int handShakes = (numberOfStudents * (numberOfStudents-1))/2;
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is " + handShakes);

        src.close();
    }
}
