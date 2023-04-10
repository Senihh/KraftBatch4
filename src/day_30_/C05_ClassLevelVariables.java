package day_30_;

public class C05_ClassLevelVariables {

    /* Bir Class içerisinde tüm methodların içerisinde bir değişkene erişmek istiyorsam
    onu methodların dışında tanımlamam gerekiyor. Class Level

    1.Class içerisinde tanımlanan değişkenin scope u tüm class tır.
    2.Class level değişkenlere ilk değer atanmasa da olur.
    3.Değer atanmadan da bu değişkenler kullanılabilir. JAVA bunlara default değerler zaten atar.
    4.static olarak tanımlanan değişkenler diğer tüm classlardan class ismiyle erişilebilir oluyor.
    5.eğer method da static ise içerisine static olmayan hiçbirşey almaz.
     */
static int turkish_Pİ=3;
int i2;
static int i;

    public static void main(String[] args) {
        System.out.println(turkish_Pİ);
        System.out.println(i);

       // yMethod(); statik olmadığı için çağıramıyoruz.

    }
    public void yMethod(){
        System.out.println(i2);//static olmayan değişkeni statik olmayan method dan çağırabiliriz.
    }
}
