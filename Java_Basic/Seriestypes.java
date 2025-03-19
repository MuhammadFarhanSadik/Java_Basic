
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class Seriestypes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of n:");
             int sum=0;   
        int n= input.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i*i;
            System.out.print(""+sum+"\n");
    }
        System.out.println("");
        System.out.println("value:"+sum);
}
}