import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = src.nextDouble();

        double area = Math.PI*radius*radius;

        System.out.println("The Area of the circle is: "+ area);
        src.close();
    }
}
