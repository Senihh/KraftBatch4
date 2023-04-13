package day_33_Arrays_3;

import java.util.Arrays;

public class C03_ArrayMethods {
    public static void main(String[] args) {
        //split
        String str="Merhaba güzel insanlar";
      String[]strArr=  str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[1]);
    }


}
