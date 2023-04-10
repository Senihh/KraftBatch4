package day_26_String_Lab;

public class String_Lab {
    public static void main(String[] args) {
        String isim = " CemaliNur  ";
        System.out.println(ilkUcHarfGetir(isim));
        System.out.println(".......................");
        System.out.println(bosluk(isim));
        System.out.println("...................");
        System.out.println(ikinciYari(isim));
        System.out.println("......................");
        System.out.println(ikinciYari2(isim));
        System.out.println(".................");
        System.out.println(ilkKelimeDegistir("merhaba", "a", "e"));
    }

    public static String ilkUcHarfGetir(String str) {

        if (str.length() >= 3) {
            str = str.substring(0, 3);
            return str;
        } else {
            return str;

        }
    }

    public static String bosluk(String str) {
        return str.replace(" ", "%");

    }

    public static String ikinciYari(String str) {
        int a = str.length();
        int b = a / 2;
        return str.substring(b, a);


    }

    public static String ikinciYari2(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2);

        } else
            return str.substring(str.length() / 2 + 1);
    }

    public static String ilkKelimeDegistir(String str,String eski, String yeni){
        return str.replaceFirst(eski,yeni);
    }

}