package _Odevler;

public class odev_nisan {
    public static void main(String[] args) {

        System.out.println(ilkUc("alimkul"));//1.soru
        System.out.println(boslukDoldur(" merhaba arkadaşlar   nasıl bir hayat  ")); //2.soru
        System.out.println(ikinciYari("yazılı"));//3.soru
        System.out.println(ilkHarfDegis("merhaba", "a", "e"));//4.soru
        System.out.println(ucTekrar("merhaba")); //5.soru

    }


    public static String ilkUc(String str) {  //1.soru
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            return str;
        }
    }

    public static String boslukDoldur(String str) {    //2.soru
        return str.replace(" ", "%");
    }

    public static String ikinciYari(String str) { //3.soru
        return str.substring(str.length() / 2);
    }

    public static String ilkHarfDegis(String str, String ch1, String ch2) { //4.soru
        return str.replaceFirst(ch1, ch2);
    }
     public static String ucTekrar(String str){ //5.soru !! bunu yapamadım.
        String result="";
        for (int i=0;i<str.length();i++){
             for (int j = 0; j < 3; j++) { //içerideki for döngüsü, buna çalış
                 result+=str.charAt(i);
             }

             }
        return  result;
         }

}





