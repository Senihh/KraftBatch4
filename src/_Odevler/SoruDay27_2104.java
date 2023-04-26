package _Odevler;

public class SoruDay27_2104 {
    public static void main(String[] args) {
        String str = "kinlenmek";
        String str1 = "ekinler";
        String str2 = "verekinlenmek";
        String str3 = "kin";
        String str4 = "demdemde";
        System.out.println(ilkveyaikincideVarMi(str));
        System.out.println(ilkveyaikincideVarMi(str1));
        System.out.println(ilkveyaikincideVarMi(str2));
        System.out.println(ilkveyaikincideVarMi2(str, str3));
        System.out.println(ilkveyaikincideVarMi2(str1, str3));
        System.out.println(ilkveyaikincideVarMi2(str2, str3));
        System.out.println(ikiOtuzIkiYazdir("Ali", "Ahmet"));
        System.out.println(ilkBesKelimeYazdie(str));
        System.out.println(ilkBesKelimeYazdie(str3));
        System.out.println(ilkikiSoniki(str4));
        System.out.println(ilkikiSoniki(str3));
        System.out.println(soyIsminiz("kamil Efe Dereli"));
        System.out.println(yileleneniCikar(str1));

    }


    public static boolean ilkveyaikincideVarMi(String str) {
        //kalite
        String kelime1 = str.substring(0, 3);
        String kelime2 = str.substring(1, 4);
        String kelime3 = "kin";
        if (kelime1.equals(kelime3) || kelime2.equals(kelime3)) {
            return true;

        }
        return false;
    }

    public static boolean ilkveyaikincideVarMi2(String str, String str2) {
        return str.substring(0, str2.length() + 1).contains(str2);

    }

    public static String ikiOtuzIkiYazdir(String str1, String str2) {
        //Ali,Ahmet
        String result = "";

        if (str1.length() > str2.length()) {
            for (int i = 0; i < 2; i++) {
                result += str2;
            }
            for (int j = 0; j < 30; j++) {
                result += str1;
            }
            for (int k = 0; k < 2; k++) {
                result += str2;
            }


        } else {
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
            for (int j = 0; j < 30; j++) {
                result += str2;
            }
            for (int k = 0; k < 2; k++) {
                result += str1;
            }

        }
        return result;
    }

    public static String ilkBesKelimeYazdie(String str) {
        //merhaba, gel
        if (str.length() < 5) {
            String str1 = ".";
            for (int i = 0; i < 5 - str.length(); i++) {
                str1 += str1;
                return str.concat(str1);
            }
        }

        return str.substring(0, 5);
    }

    public static boolean ilkikiSoniki(String str) {
        //nasılsınna
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    public static String soyIsminiz(String str) {
        // "  bahadır  kenan özkiraz  " trimle baş son bolukları al,
        //son boşluğun length ini bul. oradan itibaren yazdır.
        String str1 = str.trim();
        int sayi = str1.lastIndexOf(" ");
        String soyIsim = "Soy İsminiz ".concat(str.substring(sayi));
        return soyIsim;
    }

    public static String yileleneniCikar(String str) {
        // merhaba merhab her harfi dolaştır birden büyükse replaca ""
        String result = "";
        for (; str.length() > 0; ) {
            result += str.substring(0, 1);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }
}