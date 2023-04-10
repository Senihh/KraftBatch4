package day_31_Arrays_1;

import java.util.Scanner;

public class C01_Qestion_21 {

    // Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
    // 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın.
    // Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile birleştirerek yazdırın.
    // Slm
    // Ali

    // Slm Ali


    // iki adet sayının ebobunun nulan mtodunu yapınız.
    public static void main(String[] args) {
        System.out.println(ebob(8, 12));
    }
    public static int ebob(int x,int y){
        int result=1;
        int min=Math.min(x,y);//for un dışında yaparsan her defasında math metoduna giymesine gerek kalmaz.

        for (int i = 1; i <=min ; i++) {
            if (x%i==0&&y%i==0){
               result=i;
            }
        }
            return result;
        }    
    
}