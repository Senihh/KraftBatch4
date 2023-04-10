package _Odevler;

import java.util.Scanner;

public class Sinav {
    public static void main(String[] args) {
        /**
         * 2-) Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
         * Aldiginiz degerleri bir metoda gondererek hesaplatin
         * vucutKitleEndeksiHesapla(kilo,boy)
         *  vucut kitle endeksi = (kilo*10000 / (boy *boy))
         *  vucut kitle endeksi
         *  30’dan buyukse obez,
         *  25-30 arasi ise kilolu,
         *  20-25 arasi ise normal,
         *  20’den kucukse zayif yazdirin
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("kilonuz");
        int kilo=scan.nextInt();
        System.out.println("boyunuz");
        int boy=scan.nextInt();
        double endeks= (kilo*10000)/(boy*boy);
     if(endeks>30){
         System.out.println("obez");
     } else if (endeks>25) {
         System.out.println("kilolu");

     } else if (endeks>20) {
         System.out.println("normal");

     }else{
         System.out.println("zayıf");
     }
    }



}
