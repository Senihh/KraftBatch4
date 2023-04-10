package day_08_ScannerAndOperators;

import java.util.Scanner;

public class C05_ScannerTask {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin:");
        int girilenSayi=scan.nextInt();
        System.out.println("Girilen Sayi: "+ girilenSayi);
        System.out.println("Girilen Sayi: "+ girilenSayi*girilenSayi);
    }
}
