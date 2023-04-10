package _Odevler;

import java.util.Scanner;

public class day_20 {
    public static void main(String[] args) {
        yildizOlusturma(3);
        System.out.println(".................");
        System.out.println(tabanKuvvet());
        System.out.println("..................");
        System.out.println(sonBasamak());

    }

    public static void yildizOlusturma(int sayi) {
        int yildiz;
        for (int i = 1; i <= 3; i++) {
            for (int y = 3; y >= i; y--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
    public static int tabanKuvvet(){
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int taban= scan.nextInt();
        System.out.println("sayının kuvvetini giriniz: ");
        int kuvvet=scan.nextInt();
        int result=1;
        for (int i=0; i<kuvvet;i++){
            result*=taban;
        }
        if (taban==0 && kuvvet==0){
            System.out.println("Tanımsız");
        }return result;
    }
    public static boolean sonBasamak(){
        boolean sonBasamak;
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num1=scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int num2=scan.nextInt();
        if (num1%10==num2%10){
            sonBasamak=true;
            System.out.println("Girilen sayıların son basamakları aynıdır.");
        }else {
            sonBasamak =false;
            System.out.println("Girilen sayıların son basamakları farklıdır.");
        }
        return sonBasamak;


    }
}