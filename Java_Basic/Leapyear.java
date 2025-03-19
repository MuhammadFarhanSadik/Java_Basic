
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class Leapyear {
    public static void main(String[] args) {
        Scanner usersinput=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR DESIRED YEAR:");
        int year=usersinput.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
}
