package _Odevler;

public class SoruCalismalariDay26_210423 {
    public static void main(String[] args) {
        String str = "  gelecek güzeldir bak   ";
        String str1 = "nasılsın";
        System.out.println(ilkUcHarf(str));
        System.out.println(boslukDoldur(str));
        System.out.println(ikinciYarisi(str1));
        System.out.println(degistir(str1, "a", "e"));
        System.out.println(trimGibi(str));
        System.out.println(subString(str, 4));
        System.out.println(subStringCift(str, 2, 7));
        System.out.println(kacAdet(str1, "ı"));
        System.out.println(buHarfiSil(str, "e"));
        System.out.println(buHarfiSil2(str, 'e'));

    }

    public static String ilkUcHarf(String str) {

        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    public static String boslukDoldur(String str) {
        return str.replace(" ", "%");
    }

    public static String ikinciYarisi(String str) {
        return str.substring(str.length() / 2);

    }

    public static String degistir(String str, String ch1, String ch2) {

        return str.replaceFirst(ch1, ch2);
    }

    public static String trimGibi(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }

        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;

            }
        }
        return str.substring(start, end + 1);
    }
    public static String subString(String  str,int index){
        String result="";
        for (int i = index; i <str.length() ; i++) {
            result+=str.charAt(i);
        }
        return result;
    }
    public static String subStringCift(String str,int start,int end){
        String result="";
        for (int i = start; i <end ; i++) {
            result+=str.charAt(i);

        }
        return result;


        }
        public static int kacAdet(String str,String ch){
        str=str.toLowerCase();
        ch=ch.toLowerCase();
        int sayi1=str.length();
       int sayi2= str.replace(ch,"").length();
       return sayi1-sayi2;

        }
        public static String buHarfiSil(String str,String ch){
       return str.replace(ch,"");
        }
    public static String buHarfiSil2(String str,char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);

            }

        }
        return result;
    }
    }
