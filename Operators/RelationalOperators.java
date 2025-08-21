package Operators;

import java.util.Scanner;

public class RelationalOperators {
   public RelationalOperators() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the value of a: ");
      int var2 = var1.nextInt();
      System.out.print("Enter the value of b: ");
      int var3 = var1.nextInt();
      System.out.println("a==b: " + (var2 == var3));
      System.out.println("a!=b: " + (var2 != var3));
      System.out.println("a>b: " + (var2 > var3));
      System.out.println("a<b: " + (var2 < var3));
      System.out.println("a>=b: " + (var2 >= var3));
      System.out.println("a<=b: " + (var2 <= var3));
      var1.close();
   }
}

