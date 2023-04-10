package _Odevler;

import java.util.Scanner;

public class C01 {
    public static void main(String[]args) {

        //Bir program yazın
// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
// 2 veya 3 farklı yol ile çözmeye çalışın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int a= scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz: ");
        int b=scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz: ");
        int c=scan.nextInt();
        if((a>b) && (a>c)) {
            System.out.println(a+" sayısı en büyüktür. ");
        }else if((b>a)&&(b>c)){
            System.out.println(b+" sayısı en büyüktür. ");
        }else{
            System.out.println(c+" sayısı en büyüktür. ");
        }
        System.out.println(" ............................");

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int k,l,m;
        k=input.nextInt();
        l=input.nextInt();
        m=input.nextInt();
           boolean sonuc1=((k > l) && (k > m));
            System.out.println(k + " sayısı en büyüktür. " + sonuc1);
           boolean sonuc2 = ((l > m) && (l > k));
            System.out.println(l + " sayısı en büyüktür. " + sonuc2);
            boolean sonuc3 = ((m > k) && (m > l));
            System.out.println(m + " sayısı en büyüktür. " + sonuc3);


        }



        }





