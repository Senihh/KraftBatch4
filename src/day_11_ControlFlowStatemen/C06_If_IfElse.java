package day_11_ControlFlowStatemen;

import java.util.Scanner;

public class C06_If_IfElse {
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

    }

}
