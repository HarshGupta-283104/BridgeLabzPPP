package ProgrammingElements;

import java.util.Scanner;

public class PenDivision {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the total pens: ");
        int totalPens = src.nextInt();

        System.out.print("Enter number of students: ");
        int totalStudent = src.nextInt();

        int pensPerStudent = totalPens / totalStudent;
        int remainingPens = totalPens % totalStudent;

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);

        src.close();
    }
}
