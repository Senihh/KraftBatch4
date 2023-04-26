package _Odevler;

public class SoruDay30_230423 {
    public static void main(String[] args) {
        karakterAyir("sdsdsdddvvdvdWWQ23///)))(8SSSAX><<<||");
        System.out.println(mevsimler(12));
        System.out.println(aSALmi(29));
    }


    public static void karakterAyir(String str) {
        String harf = "";
        String sayi = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch < 'Z') {
                harf += ch;
            } else if (ch >= 'a' && ch < 'z') {
                harf += ch;

            } else if (ch >= '0' && ch < '9') {
                sayi += ch;
            } else {
                if (ch != ' ') specialChars += ch;
            }

        }
        System.out.println(harf);
        System.out.println(sayi);
        System.out.println(specialChars);
    }

    public static String mevsimler(int ay) {
        String mevsim;

        switch (ay) {
            case 12:
            case 1:
            case 2:
                mevsim = "kış";
                break;
            case 3, 4, 5:
                mevsim = "ilk bahar";
                break;
            case 6, 7, 8:
                mevsim = "yaz";
                break;
            case 9, 10, 11:
                mevsim = "son bahar";
                break;
            default:
                mevsim = "yanlıs mevsim numarası";
        }
        return mevsim;
    }

    public static boolean aSALmi(int sayi) {
        boolean asalMi = false;
        int factor = 0;
        //int karekok = (int) Math.sqrt(sayi);
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
               factor++
               ;
                break;
            }
        }

        if (sayi < 2) {
            asalMi = false;
        } else if (sayi == 0) {
            asalMi = true;

        } else if (factor==0) {
            asalMi=true;

        }else {
            asalMi = false;
        }
        return asalMi;
    }
}