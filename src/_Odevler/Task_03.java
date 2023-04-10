package _Odevler;

public class Task_03 {

    public static void main(String[] args) {
        String ad="Ömer";
        String soyad="AKÖZCE";
        System.out.println(ilkHarfiSil(ad, soyad));
        System.out.println("................................");
        System.out.println(nickName(ad, soyad));
        System.out.println("....................");
        System.out.println(sonaBasaKelimeEkle(ad, soyad));


    }
    public static String ilkHarfiSil(String isim,String soyisim) {
        if (soyisim.contains(isim.substring(0, 1))) {
            String result = soyisim.replace(isim.substring(0, 1), "");
            return result;
        } else {
            return "İsminizin başharfi soyisminizde bulunmuyor";


        }
    }
    public static String nickName(String  isim,String soyisim){
        String result=isim.substring(0,3).concat(soyisim.substring(soyisim.length()-3,soyisim.length()));
        return result;
    }
    public static String sonaBasaKelimeEkle(String kelime1,String kelime2){
        if (kelime1.length()>kelime2.length()){
           String result= kelime2.concat(" "+kelime1.concat(" "+kelime1));
            return result;

        }else{
            String result= kelime1.concat(" "+kelime2.concat(" "+kelime1));
            return result;
        }
    }


}
