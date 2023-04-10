package _Odevler;

public class Task_02 {
    public static void main(String[] args) {
        String kelime="merhaba nasılsın  iyi misin";
        String kelime2="askı";
        System.out.println(ilkUc(kelime));
        System.out.println(".............................");
        System.out.println(bosluk(kelime));
        System.out.println("......................");
        System.out.println(ikinciYari(kelime2));
        System.out.println("...........................");
        System.out.println(degistir("ömeree", 'e', 'a'));
    }
    public static String ilkUc(String str){
        return str.substring(0,3);
    }
    public static String bosluk(String str){

        return str.replace(" ","%");
    }
    public static String ikinciYari(String str){
        return str.substring(str.length()/2);
    }
    public static String degistir(String str,char harf1,char harf2){
        int sayi=str.indexOf(harf1);
      return   str.replace(str.charAt(sayi),harf2);

    }
}
