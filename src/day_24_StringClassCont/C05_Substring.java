package day_24_StringClassCont;

public class C05_Substring {
    public static void main(String[] args) {
        String str="Java Programming Language";
           //       0123456789012345678901234
        //Substring metodu iki şekilde kullanılır
        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.substring(17));
        System.out.println(str.substring(str.length()));//emptyIndex hiçlik ""
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length()-8));

        System.out.println(str.substring(3, 5));
        System.out.println(str.substring(5, 16));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(str.length() - 1,str.length()));
        System.out.println(str.substring(5, 5));//""
       // System.out.println(str.substring(5, 3)); //Runtime Error; StringIndexOutOfBoundsException


    }
}
