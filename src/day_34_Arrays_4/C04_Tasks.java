package day_34_Arrays_4;

import java.util.Arrays;

public class C04_Tasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildIntArray(8)));
    }

    public static int[] buildIntArray(int n){
        int[] intArr=new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=i;
        }
        return intArr;

    }
    //Bir sayı dizisinin en küçük elemani ne ise sayı dizisini onunla dolduran bir
    //method yazın

    //Bir sayı dizisinin en küçük elemani ne ise sayı dizisini (en büyük değer hariç) onunla dolduran bir
    //method yazın

}
