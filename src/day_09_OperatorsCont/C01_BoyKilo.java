package day_09_OperatorsCont;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[]args){

    Scanner input = new Scanner (System.in);

    System.out.println("Boyunuzu giriniz:");
    double boy=input.nextDouble();

        System.out.println("Kilonuzu giriniz:");
        double kilo=input.nextDouble();


        System.out.println("lütfen isminizi giriniz");
        String isim=input.next();

        input.nextLine();
        System.out.println("Lüfen soyisminizi giriniz:");
        String soyisim=input.nextLine();


        System.out.println("İsminiz : "+isim+ " Soyisminiz : "+ soyisim);
        System.out.println("Boyunuz: "+ boy+ " m Kilonuz:  "+kilo+ "kg");






}
}
