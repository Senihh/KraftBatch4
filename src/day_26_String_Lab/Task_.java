package day_26_String_Lab;

public class Task_ {
    public static void main(String[] args) {
        String isim = "Merhaba";
      char  k='a';
        int sayi = 5;
        System.out.println(herKelimeyiUcDefaYazdir(isim));
        System.out.println(".................");
        System.out.println(karakterSay(isim, "a"));
        System.out.println("..........................");
        System.out.println(kelimeKaldir(isim, k));

    }

    public static String herKelimeyiUcDefaYazdir(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static int karakterSay(String str, String a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;


            }

        }
        return count;
    }

    public static String kelimeKaldir(String str,char a){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=a){
                result+=str.charAt(i);
            }

        }

   return result;

        }
    }









