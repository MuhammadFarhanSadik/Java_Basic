
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class SeriesTypes2 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n,i,even=0,odd=0,sum=0;
        System.out.print("please Enter YOUR nth value:");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                even=even+i;}
                else
            {
                 
                odd=odd+i;
                
            }
        }
            sum=odd-even; 
        
        System.out.printf("your  sum is:%d",sum);     
    }
}
