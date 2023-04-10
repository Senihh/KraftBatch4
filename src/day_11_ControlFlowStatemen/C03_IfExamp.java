package day_11_ControlFlowStatemen;

import java.util.Scanner;

public class C03_IfExamp {
    public static void main(String[]args){
/*

        double f=55;
        double k=55;
        double ort=(f+k)/2;
        boolean resault=(ort>50);
        double gecmeNotu=50;
        if(ort>gecmeNotu); //en temizi güzeli
        if(resault){
            System.out.println("Ali geçti.");
           */

        Scanner scan=new Scanner(System.in);
        System.out.println("ders notlarınızı giriniz");
        System.out.println("Fizik");
        double f=scan.nextDouble();
    System.out.println("Kimya");
        double k=scan.nextDouble();
        System.out.println("Matematik");
        double m=scan.nextDouble();
        System.out.println("Geçme Notu");
        double gecmeNotu=scan.nextDouble() ;

        double ort=(f+k)/2;
        if(ort>gecmeNotu){
            System.out.println("Sınıfı geçtiniz");
        }else {
            System.out.println("kaldınız");

        }





    }
}
