package day_35_Arrays_Summary;

import java.util.Arrays;

public class ArraysSummary {
    public static void main(String[] args) {
        int array[] = new int[7];
        array[2] = 23;
        array[4] = 45;
        array[5] = 123;
        System.out.println(Arrays.toString(array));

        String str=Arrays.toString(array);
        String[] yeniArray= str.replace("[","").replace("]","")
                .replace(",","").split(" ");
        String[] yeniArray1=str.substring(1,str.length()-2).replace(" ","").split("");
    }


    public static String arrayYazdir(int[] arr) {
        String result = "";
        for (int sayi : arr) {
            result += sayi;

        }
        return result;
    }

    public static String[] terstenYazdir(String str) {
        String yeinArray[] = str.trim().split("");
String resultArray[]=new String[yeinArray.length];
        for (int i = 0,j= yeinArray.length-1; i < yeinArray.length ; i++,j--) {
            resultArray[i]=yeinArray[j];

        }
        return resultArray;
    }
}