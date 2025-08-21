import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        double base = src.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = src.nextDouble();

        double result = Math.pow(base,exponent);

        System.out.println(base + "rasies to the power" + exponent + "=" + result);

        src.close();
    }
}
