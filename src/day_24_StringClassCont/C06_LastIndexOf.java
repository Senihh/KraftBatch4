package day_24_StringClassCont;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        //indexOf() ilk bulunan indexini getiriyor.
        //lastIndexOf son bulunan indeksini getiriyor.

        String str="Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("......................");
        int length=str.length();
        System.out.println(length);
       int langthFinal= str.replace("a","").length();
        System.out.println("str.length() = " + str.length());
        System.out.println(str+" içerisinde a "+(length-langthFinal)+" adet mevcuttur");
    }
}
