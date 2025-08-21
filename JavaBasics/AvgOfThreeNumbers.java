import java.util.Scanner;

public class AvgOfThreeNumbers {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = src.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = src.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = src.nextDouble();

        double result = (a+b+c)/3;

        System.out.println("The avg of three numbers: "+ result);

        src.close();
    }
}
