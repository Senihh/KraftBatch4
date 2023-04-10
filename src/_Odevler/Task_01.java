package _Odevler;

public class Task_01 {
    public static void main(String[] args) {
        //isminizin ortasındaki 3 harfi veren bit method
        String adiniz="Abd";
        String soyad="Yahşi";
      //  System.out.println(ortadakiUcHarf(adiniz));
        System.out.println("..................");
        System.out.println(isimSoyisim(adiniz, soyad));

    }
    public static String ortadakiUcHarf(String isim){
      return isim.substring(3,6);


        }
        public static String isimSoyisim(String isim,String soyisim){
        if(isim.length()>soyisim.length()){
            String esitle=isim.substring(0,soyisim.length());
            String result=esitle.concat(""+soyisim);
            return result;

        }else {
            String esitle=soyisim.substring(0,isim.length());
            String result= isim.concat(""+esitle);
            return result;
        }
        }

    }

