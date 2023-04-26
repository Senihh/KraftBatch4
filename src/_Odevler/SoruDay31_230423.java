package _Odevler;

import java.security.SecureRandom;
import java.util.Scanner;

public class SoruDay31_230423<gecersiz> {

    public static void main(String[] args) {

        String []array=new String[4];
        array[0]="selam";
        array[1]="nasıl";
        array[2]="iyi";
        array[3]="güzel";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String kelimeler:array) {
            System.out.print(kelimeler);
            System.out.println();
        }


        int[]x= new int[5];

        int[]y;
        y=new  int[5];
        int z[]=new int[5];
        z[0]=107;
        z[1]=14;
        z[2]=57;
        z[3]=167;
        z[4]=23;
        int ciftSayi=0;
        for (int arr:z){
            if (arr%2==0){
                ciftSayi++;
            }
        }

        String str[]=new  String[3];
        str[0]="Ayhan";
        str[0]="Kasım";
        str[0]="Abdullah";


        String str2[]={"Ayhan","Kasım","Abdullah"};
        str2[2]="Abdullah";
        str2[0]="Ayhan";

        int sayilar[]=new int[2];
        sayilar[0]=89;
        sayilar[1]=105;
        int toplam=sayilar[0]+sayilar[1];
        System.out.println(toplam);
        System.out.println(sayilar.length);
        System.out.println(ciftSayi);

        System.out.println(kelimeKontrol());
        System.out.println(ebob(34, 17));
        System.out.println(ekok(3, 4));
        System.out.println(ekok(7, 8));
        System.out.println(ekok(3, 9));

    }

    public static String kelimeKontrol() {
        Scanner scan = new Scanner(System.in);
        String kelime1 = "";
        String kelime2 = "";
        System.out.println("Lütfen 1 ile 4 karakterden oluşan bir kelime giriniz");
            int i = 0;
        while (true) {
            System.out.println("lütefen 1. kelimeyi giriniz");
            kelime1 = scan.nextLine();
            if (kelime1.length() > 0 && kelime1.length() < 5) {
                break;
            }
            System.out.println("Hatalı giriş, lütfen tekrar deneyiniz.");
            i++;
            if (i == 3) return null;

        }
         i = 0;
        while (true) {
            System.out.println("lütefen 2. kelimeyi giriniz");
            kelime2 = scan.nextLine();
            if (kelime2.length() > 0 && kelime2.length() < 5) {
                break;
            }
            System.out.println("Hatalı giriş, lütfen tekrar deneyiniz.");
            i++;
            if (i == 3) return null;

        }
        return kelime1.concat(" ").concat(kelime2);
    }
    public static int ebob(int x,int y){
        int result=0;
        int min=Math.min(x,y);
        for (int i = 1; i <=min ; i++) {
            if (x%i==0&&y%i==0){
                result=i;

            }

        }
        return result;
    }
    public static int ekok(int a,int b){

        return a*b/ebob(a, b);
    }




}