
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class power_given_base_and_exponent {
    public static void main(String[] args) {
        
        Scanner inputnibe = new Scanner(System.in);
        
        // Taking base and exponent as input from the user
        System.out.print("Enter the base: ");
        int base = inputnibe.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = inputnibe.nextInt();
        
        // Initializing the result as 1 (since any number raised to the power 0 is 1)
        int result = 1;
        
        // Loop to calculate the power
        for (int i = 1; i <= exponent; i++) {
            result = result*base;
            System.out.print("your result upgrade:" +result+"\n");
        }
        
        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        
    }
}

    

