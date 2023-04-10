package day_10_UneryLogicalOperAndReview.Dat10_ClassNotes;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[]args){

       /*
        1. write a program that can swipe two variables' value by using a temporary variable

        Ex:
        if a= 10, b=15

        output:
        a = 15
        b = 10
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("a değeri için bir sayı giriniz: ");
        int a=scan.nextInt();

        System.out.println("b değeri için bir sayı giriniz: ");
        int b= scan.nextInt();


        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int box=a;
        a=b;
        b=box;

        System.out.println("a: "+a);
        System.out.println("b: "+b);








    }

}
