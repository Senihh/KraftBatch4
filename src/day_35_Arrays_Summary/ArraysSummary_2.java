package day_35_Arrays_Summary;

import java.util.Arrays;

public class ArraysSummary_2 {

    public static void main(String[] args) {
       /* String str="Merhaba selam nasılsın";
        String []strArrays=str.split("");
        System.out.println(Arrays.toString(strArrays));
       // System.out.println(strArrays); referans adreesini veriyor.
        for (String s:strArrays){
            System.out.println(s);
        }
        System.out.println(strArrays.length);
*/

        String[] strArray = {"Ahmet", "Tarık", "Faruk"};
        String[] yeniArray = Arrays.copyOfRange(strArray, 0, strArray.length);
        System.out.println(Arrays.toString(yeniArray));
         /*    String yeniArray[]=new String [strArray.length];
        for (int i = 0; i <strArray.length ; i++) {
            yeniArray[i]=strArray[i];
        }
*/

      //  Arrays.sort(arr);
     //   System.out.println(Arrays.toString(arr));
     //   System.out.println(maxArray(arr));
        int[] arr = {9, 8, 3, 7, 1, 5, 4, 2, 6, 0};
        Arrays.fill(arr,0,7,10);
        System.out.println(Arrays.toString(doldur(arr, 3, 5, 100)));
        System.out.println(Arrays.toString(arr));

    }

    public static int[] doldur(int []arr,int from,int to,int value){
        int[] resultArray=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.fill(resultArray,from,to,value);
        return Arrays.copyOfRange(resultArray,0,arr.length);
    }
    public static int maxArray(int[]array){
        int []yeiArray=Arrays.copyOfRange(array,0,array.length);
        Arrays.sort(yeiArray);
        return yeiArray.length-1;
    }
}