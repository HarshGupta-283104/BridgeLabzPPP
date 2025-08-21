package ProgrammingElements;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter Sam's marks in Maths: ");
        int maths = src.nextInt();

        System.out.print("Enter Sam's marks in Physics: ");
        int physics = src.nextInt();

        System.out.print("Enter Sam's marks in Chemistry: ");
        int chemistry = src.nextInt();

        double avg = (maths+physics+chemistry)/3;

        System.out.println("The avg PCM marks of Sam's: " + avg);
        src.close();
    }
}
