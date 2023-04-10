package day_10_UneryLogicalOperAndReview.Dat10_ClassNotes;

import java.security.PublicKey;
import java.util.Scanner;

public class C01_PositiveOrNegative {
    public  static void main(String[]args){
/*
1. Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number=scan.nextInt();

        boolean isPositive= number>0;
        boolean isNegative= number<0;
        boolean isZero= number==0;

        System.out.println(number+ " is positive number: "+isPositive );
        System.out.println(number+ " is negative number: "+isNegative );
        System.out.println(number+ " is zero number: "+isZero );
*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi= scan.nextInt();
        boolean isPositive=sayi>0;
        boolean isNegative=sayi<0;
        boolean isZero= sayi==0;

        System.out.println(sayi+" is Positive sayı: "+ isPositive);
        System.out.println(sayi+" is Negative sayı: " +isNegative);
        System.out.println(sayi+ " is zero sayı: "+ isZero);

    }
}
