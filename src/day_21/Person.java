package day_21;

public class Person {
    //İsim,cinsiyet,yaş fields
    // uyu() oyunOyna()
    String isim;
    String cinsiyet;
    int yas;
    String tcNo;

    public void uyu(){
        System.out.println(isim+" uyuyor");
    }
    public void oyunOyna(){
        System.out.println(isim+" oyun oynuyor");
    }
    public void tumBilgileriGtir(){
        System.out.println("isim "+isim);
        System.out.println(yas);
        System.out.println(cinsiyet);
        System.out.println("kimlik numarası "+tcNo);
    }
}
