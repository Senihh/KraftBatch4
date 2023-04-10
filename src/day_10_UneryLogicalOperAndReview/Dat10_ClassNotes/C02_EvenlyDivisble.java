package day_10_UneryLogicalOperAndReview.Dat10_ClassNotes;

import java.util.Scanner;

public class C02_EvenlyDivisble {
    /*
* 2. Create a class called C01_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5

            Ex:
                number = 65;*/
    public static void main(String []args){
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
       int number=scan.nextInt() ;
       boolean isDivisibleBy2=number%2==0;
       boolean isDivisibleBy3=number%3==0;
       boolean isDivisibleBy5=number%5==0;

       System.out.println(" is divisibele by 2: "+ isDivisibleBy2);
       System.out.println(" is divisibele by 3: "+ isDivisibleBy3);
       System.out.println(" is divisibele by 5: "+ isDivisibleBy5);
*/
        Scanner scan= new Scanner(System.in);
        System.out.println("lütgen bir sayı giriniz: ");
        int number = scan.nextInt();
        boolean isDivisibleBy2= number%2==0;
        boolean isDivisibleBy3= number%3==0;
        boolean isDivisibleBy5= number%5==0;

        System.out.println(number+" is divisible by 2 "+ isDivisibleBy2);
        System.out.println(number+" is divisible by 3 "+ isDivisibleBy3);
        System.out.println(number+" is divisible by 5 "+ isDivisibleBy5);








    }

}
