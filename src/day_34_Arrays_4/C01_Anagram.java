package day_34_Arrays_4;

import java.util.Arrays;

public class C01_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("adam", "dama"));
        System.out.println(isAnagram("adam", "dama"));
    }
    public static boolean isAnagram(String str1, String str2) {
// write a method that can check if str1 & str2 are build out same characters ANAGRAM

     /*   boolean anagram=false;
      char chArr1[]=  str1.toCharArray();
      char chArr2[]=  str2.toCharArray();
      //  System.out.println(Arrays.toString(chArr1));
      //  System.out.println(Arrays.toString(chArr2));

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        return Arrays.equals(chArr1,chArr2);
*/


       char[] chArr1= str1.toCharArray();
       char[] chArr2= str2.toCharArray();
       Arrays.sort(chArr1);
       Arrays.sort(chArr2);

        return    Arrays.equals(chArr1,chArr2);


    }


}