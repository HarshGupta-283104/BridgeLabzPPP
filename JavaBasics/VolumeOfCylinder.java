import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the radius of cylinder:" );
        double radius = src.nextDouble();

        System.out.print("Enter the height of the cylinder:" );
        double heigth = src.nextDouble();

        double volume = Math.PI * radius * radius * heigth;

        System.out.println("The volume of the cylinder: " + volume);

        src.close();
    }
}
