package day_24_StringClassCont;

import java.util.Scanner;

public class C01_StringRreview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminzi giriniz");
        String isim=scan.nextLine();
//length,charAt
        int uzunluk=isim.length();
        char sonHarf=isim.charAt(uzunluk-1);
        System.out.println(sonHarf);

//equals() Yavuz Selim

        System.out.println(isim==" Yavuz Selim ");
        System.out.println(isim.equals(" Yavuz Selim "));

        System.out.println(isim.equalsIgnoreCase(" Yavuz SEliM "));

        //toUpperCase toLoweCase
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

        //trim
        System.out.println(isim.trim());

        //indexOf
        System.out.println(isim.indexOf("S"));
        System.out.println(isim.indexOf("Selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));
        int ilkIndex=isim.indexOf("Y");
        int sonIndex=isim.lastIndexOf("Y");
        if(ilkIndex==sonIndex){
            System.out.println("Y harfi Stringde uniquettir");
        }

        //replace()
        System.out.println(isim.replace(" ", ""));
        System.out.println(isim.replace("vuz", "giz"));
        String message="Merhaba";
        String message1="Merhaba";
        System.out.println(message==message1);

        System.out.println(message.replace('a','e'));
        System.out.println(message.replaceFirst("a", "e"));
    }
}
