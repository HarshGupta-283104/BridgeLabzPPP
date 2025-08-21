import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        double celsius = src.nextDouble();

        double Fahrenheit = (celsius*9/5) + 32;
        System.out.println("Temparature in Fahrenheit: "+ Fahrenheit);

        src.close();
    }
}
