package day_24_StringClassCont;

public class C03_StringIsEmty {
    //isEmpty Stringin bos olup olmadığını kontrol eder.
    public static void main(String[] args) {
        String s1="Merhaba";
        System.out.println(s1.isEmpty());
       String s2="";
        System.out.println(s2.isEmpty());
        String s3=" ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());



    }


}
