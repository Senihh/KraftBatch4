package mentoring_day_05;

import java.util.Scanner;

public class C02_Task {
    public static void main(String []args){

        Scanner scan=new Scanner(System.in);

        System.out.println("3 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int a=sayi%10; //321/10 modu 1
        int b=(sayi%100)/10;
        int c=sayi/100;

        System.out.println(""+a+b+c);


    }
}
