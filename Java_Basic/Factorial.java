
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class Factorial {
      public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          System.out.print("ENTER YOUR Desired NUMBER:");
        int n =input.nextInt();
                int fact = 1;

        for (int i = n; i >= 1; i--) { // Loop from n to 1
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

