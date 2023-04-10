package day_25_;

public class String_Example {
    public static void main(String[] args) {
        String cumle="Merhaba";
        String cumle2="dünya";
        System.out.println(cumle.replace("Mer", "Har"));
        System.out.println(kelimeDegistir(cumle, "Mer", "Har"));
    }

    public static int uzunluk(String str){
        return str.length();
    }
public static String harflerikucult(String str){
        return str.toLowerCase();
}
public static char karakter(String str,int index){
        return  str.charAt(index);

}
public static String kelimeDegistir(String str,String eskiKelime,String yeniKelime){
        return str.replace(eskiKelime,yeniKelime);

}

}
