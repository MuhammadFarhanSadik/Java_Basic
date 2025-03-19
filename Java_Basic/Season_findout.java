
package java_basic_programming_by_farhan_sadik;

import java.util.Scanner;


public class Season_findout {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR DESIRED SEASON'S NUMBER:");
        int season=input.nextInt();
        switch (season){
            case 1:
                System.out.print("Summer (Grishmo)");
                break;
            case 2:
                System.out.print("Monsoon (Borsha) ");
                break;
            case 3:
                System.out.print("Autumn (Shorot)");
                break;
            case 4:
                
                System.out.print("Late Autumn (Hemonto)");
                break;
            case 5:
                System.out.print("Winter (Sheet) ");
                break;
                case 6:
                System.out.print("Spring (Boshonto)");
                break;
                default:
                    System.out.print("WRONG INPUT!!!!"); 
    }
    
}
}//BY MUHAMMAD FARHAN SADIK