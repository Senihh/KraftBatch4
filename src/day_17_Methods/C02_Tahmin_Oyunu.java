package day_17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {
        //Bilgisayarın tuttuğu 0 dahil-50 arası 5 hamlede bulma
        // tuttuğu sayıdan düşük bir tahmin yaparsa yukarı
        // tuttuğu sayıdan yüksak bir tahmin yaparsa aşağı

        Random random=new Random();
        int sayi=random.nextInt(50);

        Scanner scan=new Scanner(System.in);
        int i=1;
        while (i<=5){
            System.out.println(i+". Tahmin");
            int tahmin=scan.nextInt();
            if(tahmin>sayi){
                System.out.println("Aşağı");
            } else if (tahmin<sayi) {
                System.out.println("Yukarı");


            }else if(tahmin==sayi){
                System.out.println("Tebrikler ");
                break;
            }
            i++;
            if(i==6){
                System.out.println("Malesef bilemedin   "+ sayi);
            }


        }










    }
}
