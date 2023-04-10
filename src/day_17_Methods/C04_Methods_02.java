package day_17_Methods;

import java.util.Scanner;

public class C04_Methods_02 {
    {
        aritmetikOrtalama();
        System.out.println("...............");
        enBuyuk();
        System.out.println("........................");
        kiloOkkaCevir();
    }

    public static void aritmetikOrtalama() {
        double x = 3, y = 6, z = 88;
        System.out.println("ortalama " + (x + y + z / 3));


    }
    //Bir method yazın 2 sayıdan büyük olanı versin

    public static void enBuyuk() {
        int x = 10, y = 20;
        int max;
        if (x > y) {
            max = x;

        } else {
            max = y;

        }
        System.out.println(" sayısı en büyüktür sayı  " + max);
    }
    //Bir method yazın ve kiloyu hokka cinsinden versin.

    public static void kiloOkkaCevir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kg: ");
        double kg = scan.nextDouble();
        double okka = kg * 1282;
        System.out.println(kg + " kg " + okka + "  okkadır");

    }

    public static void main(String[] args) {
        int sayi = 7;
        kupHesapla(sayi);
        System.out.println("...............");
        int rakam = 9;
        kareHesapla(rakam);
        System.out.println("................");
        isimYaz("Ömer");
        System.out.println("...................");
        max(5,9);
        ortalama(5,10);

    }

    public static void kupHesapla(int x) {
        int result = x * x * x;
        System.out.println("sonuç: " + result);

    }

    //bir sayının karesini yazan metodu yazınız.
    public static void kareHesapla(int x) {
        int result = x * x;
        System.out.println("Karesi: " + result);
    }

    //parametre olarak isminizi alan ve sonucunda isminiz ... yazan programı yazınız.
    public static void isimYaz(String name) {
        System.out.println("İsminiz " + name);

    }

    public static void max(int x, int y) {
        int max;
        if (x > y) {
            max = x;

        } else {
            max = y;

        }
        System.out.println(" sayısı en büyüktür sayı  " + max);
    }

    public static void ortalama(int x,int y){
        double ort=((double) x+y)/2;
        System.out.println("ortalama "+ ort);
    }

}

