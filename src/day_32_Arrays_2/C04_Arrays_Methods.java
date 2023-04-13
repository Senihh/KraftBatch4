package day_32_Arrays_2;

import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {
        //int arr[]={23,25,56};
        //   System.out.println("bestenBuyukMu(array) = " + bestenBuyukMu(arr));
        int array[] = {5, 25, 26, 36};

        System.out.println(uzunlukKontrol(array));

    }
public static String[] kelimeDepola() {
    String arr[] = new String[3];
    Scanner scan = new Scanner(System.in);
    System.out.print("1. kelime");
    String kelime1 = scan.nextLine();
    arr[0] = kelime1;
    System.out.println("2.kelime");
    String kelime2 = scan.nextLine();
    arr[1] = kelime2;
    System.out.println("3.kelime");
    String kelime3 = scan.nextLine();
    arr[2] = kelime3;
    return arr;

}


    //Bir method yazın int array kabul etsin
    // array in içinde 5 olup olmadığını kontrol etsin. (kontrol varsa boolean)
    public static boolean sayiKontrol(int[] array, int sayi) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sayi) {
                return true;
            }

        }
        return false;
    }
    //
    public static boolean uzunlukKontrol(int[]arrr){
        return arrr.length>5;
    }
}
