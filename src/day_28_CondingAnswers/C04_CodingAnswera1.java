package day_28_CondingAnswers;

import java.util.Scanner;

public class C04_CodingAnswera1 {
    public static void main(String[] args) {
        System.out.println(sayiToplami(3));
        System.out.println("................");
        vucutKiloEndeksi(64, 170);
        System.out.println("...............");
        System.out.println(frequency("merhaba", "a"));
        System.out.println(".................");
        System.out.println(faktorial(5));
    }

    public static int sayiToplami(int sayi) {
        int result = 0;

        for (int i = 1; i <= sayi; i++) {
            result += i;
        }
        return result;
    }

    /**
     * 2-) Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
     * Aldiginiz degerleri bir metoda gondererek hesaplatin
     * vucutKitleEndeksiHesapla(kilo,boy)
     * vucut kitle endeksi = (kilo*10000 / (boy *boy))
     * vucut kitle endeksi
     * 30’dan buyukse obez,
     * 25-30 arasi ise kilolu,
     * 20-25 arasi ise normal,
     * 20’den kucukse zayif yazdirin
     */

    public static void vucutKiloEndeksi(int kg, int boy) {
        double vucutKiloEndeksi = (kg * 10000) / (boy * boy);

        if (vucutKiloEndeksi > 30) System.out.println("obez");

        else if (vucutKiloEndeksi > 25) System.out.println("kilolu");

        else if (vucutKiloEndeksi > 20) System.out.println("normal");

        else System.out.println("zayıf");

    }

    public static int frequency(String str, String ch) {
        return str.length() - str.replace(ch, "").length();
    }

    /**
     * girilen sayının faktoriyeli
     */
    public static int faktorial(int n) {
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;


        }

        return faktorial;

    }

}