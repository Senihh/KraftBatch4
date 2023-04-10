package day_30_;

public class C06_Hastane {

    public static void main(String[] args) {
        Doktor hekim1=new Doktor(); // Instance değişkenler ancak obje oluşturarak erişilebilir.
        System.out.println(hekim1.cinsiyet);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);
        hekim1.isim="Kaan";
        hekim1.soyisim="Sarp";
        hekim1.uzmanMi=false;
        hekim1.yas=32;

        System.out.println(hekim1.isim);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.isim);
        System.out.println(Doktor.fakulte);
        Doktor.fakulte="Hacettepe Tıp Fakültesi";

        System.out.println(hekim1);

        System.out.println("..........................");

        Doktor hekim2=new Doktor();
        hekim2.isim="Buket";
        System.out.println(Doktor.fakulte);

    }

}
