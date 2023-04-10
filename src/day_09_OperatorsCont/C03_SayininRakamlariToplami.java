package day_09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {
    public static void main(String[]args){
// Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 3 basamalı pozitif bir sayı giriniz:");

        int number= scanner.nextInt();
        int lastDigit=number%10;
        int totalOfDigit = lastDigit;

        number=number/10;
        lastDigit=number%10;
        totalOfDigit=totalOfDigit+lastDigit;

        number=number/10;
        lastDigit=number%10;
        totalOfDigit=totalOfDigit+lastDigit;

        System.out.println("Girilen sayını rakamlar toplamı:"+ totalOfDigit);


    }
}
