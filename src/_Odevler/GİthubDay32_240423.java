package _Odevler;

import java.util.Arrays;

public class GİthubDay32_240423 {
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 5};
        int[] arr2 = {35, 3, 36};
        String[] array = new String[4];
        array[0] = "selam";
        array[1] = "nasıl";
        array[2] = "iyi";
        array[3] = "güzel";
        System.out.println(Arrays.toString(arrayBirlestir(arr1, arr2)));
        arrayYazdir(arr1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String kelimeler : array) {
            System.out.print(kelimeler);
            System.out.println();


        }
        System.out.println(Arrays.toString(array));
        System.out.println(toString(array));
    }

    public static String toString(String[] arrr) {
        String result = "[";
        for (int i = 0; i < arrr.length; i++) {
            if (i == arrr.length - 1) {
                result += arrr[i] + "]";
            } else {
                result += arrr[i] + ", ";
            }

        }
        return result;
    }

    public static int[] arrayBirlestir(int[] arr1, int[] arr2) {

        int[] yeniArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            yeniArray[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < yeniArray.length; i++) {
            yeniArray[i] = arr2[j];
            j++;

        }
        return yeniArray;
    }

    public static void arrayYazdir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + "-");
            }

        }
    }
    //silinecek day32 c04 toplamvecarpım da kaldım

}


