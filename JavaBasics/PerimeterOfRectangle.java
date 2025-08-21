import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = src.nextDouble();

        System.out.print("Enter the width of the ractangle: ");
        double width = src.nextDouble();

        double perimeter = 2*(length + width);

        System.out.println("The Perimeter of the rectangle: "+ perimeter);

        src.close();
    }
}
