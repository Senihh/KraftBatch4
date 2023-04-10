package day_09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleIndeksi {
    /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / (Boy(m) * Boy(m))

        */





    public  static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kilonuzu giriniz:");
        int kilo= scan.nextInt();

        System.out.print("boyunuzu giriniz(örnek:1.80):");
        double boy=scan.nextDouble();

        double bki=kilo/(boy*boy);
        System.out.print("kilomuz: "+kilo);
        System.out.print("boyunuz: "+boy);
        System.out.println("beden kitle indeksi: "+ bki);


}
        }