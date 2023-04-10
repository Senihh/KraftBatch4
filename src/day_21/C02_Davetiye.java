package day_21;

import java.util.Scanner;

public class C02_Davetiye {
   /* Düğün
    kartı bastıran bir program yazın
            Kullanıcıdan
2 adet kelim e isteyen bir metodunuz olsun Bu metot
    kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
    kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
    kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
    istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
    bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin
    */
    public static void davetiye(){
        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelime: ");
        String kelime1=scan.nextLine();
        System.out.println("2. kelime");
        String kelime2=scan.nextLine();
        kelimeKontrol(kelime1,kelime2);
    }
    private static boolean kelimeKontrol(String str,String str2){
        return str.equals(str2);
    }
}
