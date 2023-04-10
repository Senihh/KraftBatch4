package day_21;

public class Main {
    public static void main(String[] args) {
        Daire daire1=new Daire();
        Daire daire2=new Daire();
        daire1.r=5;
        daire2.r=20;
daire1.alanHesapla();
daire2.alanHesapla();
        System.out.println(daire1.cevreHesapla());
        System.out.println(daire2.cevreHesapla());


    }
}
