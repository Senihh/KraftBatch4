package _Odevler;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;

public class Odev_26_Soru_Array {
    public static void main(String[] args) {
        int[] arr = {11, 45, 345, 71, 12, 3, 44, 3, 3};
        int[] arr2 = {11, 45, 345, 71, 44, 3};
        String[] str = {"11", "12"};
        System.out.println(arraytaopla(arr));//1
        System.out.println(ciftTopla(arr));//2
        System.out.println(ucleriTopla(arr));//3
        System.out.println(enBuyuk(arr));//4
        System.out.println(enKucuk(arr));//4
        System.out.println(enKucukAta(arr));//incele
        System.out.println(Arrays.toString(arayaInadeksAta(13, 19)));//6

        System.out.println(ikincideBirinciVarMi(arr2, arr));//8
        // System.out.println(tersCevir(str));//incele 9


    }

    public static int arraytaopla(int[] arr) {
        //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.
        int result = 0;
        for (int sayi : arr) {
            result += sayi;
        }
        return result;

    }

    public static int ciftTopla(int[] arr) {
        // Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını
        // veren metodu yazınız.
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result += arr[i];
            }

        }
        return result;
    }

    public static int ucleriTopla(int[] arr) {
        //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını
// veren metodu yazınız.
//[2,3,3,6,5,4,3] →9
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                result += arr[i];

            }
        }
        return result;
    }

    public static int enBuyuk(int[] arr) {
        //rnek 4: Array’in içerisindeki en büyük ve en küçük
        // sayıyı bulan metodu yazınız. (Arrays.sort
        //kullanılmayacak)

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];


            }

        }
        return max;


    }

    public static int enKucuk(int[] arr) {
        //rnek 4: Array’in içerisindeki en büyük ve en küçük
        // sayıyı bulan metodu yazınız. (Arrays.sort
        //kullanılmayacak)

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }

        }
        return min;

    }

    public static int enKucukAta(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }


        }
        return result;
    }

    public static int[] arayaInadeksAta(int a, int b) {
        //Örnek 6: 2 adet integer sayı alan ve arasındaki
        // sayıları indekslere atayan metodu yazınız.
        //createArray(8,15) → [8,9,10,11,12,13,14,15]

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int[] resultArray = new int[max - min + 1];
        for (int i = min, j = 0; i <= max; i++, j++) {
            resultArray[j] = i;


        }
        return resultArray;

    }


    //  public static  int arrayBirlestir(int[]arr1,int[]arr2) {
    //Örnek 7: 2 adet array kabul eden ve sonucunda bu 2
    // array’in verileri ile birlikte tek bir array
    //oluşturan metodu yazınız.
    //[1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]


    //  }

    public static boolean ikincideBirinciVarMi(int[] arr1, int[] arr2) {

        //Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar
        // ikinci arrayin içinde yer alıyorsa true
        //yer almıyorsa false yazdıran metodu yazınız.
        //[5,4,3,2,1] , [1,2,3,4,5,7,9] true
        //[5,4,3,2,1,7,5] , [1,2,3,4,5] false
        firstloop:
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    continue firstloop;
                }

            }
            return false;
        }
        return true;
    }
//public static int tersCevir(int[]arr){
    // public static String tersCevir(String[] arr) {
    //Örnek 9: Array’in içerisindeki sayıları ters
    // çevirerek yeni bir array oluşturan metodu yazınız
    //[5,4,3,2,1] -----------> [1,2,3,4,5]

    }
  //  public static int rastgele(int[] arr) {
        //Örnek 10: Boyutu 10 olan bir array oluşturun ve
        // içerisine Random sınıfını kullanarak 0-100 arasında
        //rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.






