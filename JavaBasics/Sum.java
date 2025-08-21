import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = src.nextInt();

        System.out.print("Enter Secount number: ");
        int num2 = src.nextInt();

        int sum = num1 + num2;

        System.out.println("The Sum is: " +sum);


        src.close();
    }
}
