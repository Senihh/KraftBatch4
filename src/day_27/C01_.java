package day_27;

public class C01_ {
    public static void main(String[] args) {
        String kelime="kinlenmek";
        char k='.';
        System.out.println(besKaraktereTamamla("hayat Güzeldir",11,'.'));
        System.out.println("....................");
        System.out.println(ilkIkiSonIkiHarf("me"));
        System.out.println(ilkIkiSonIkiHarf("han"));
        System.out.println(".......................");
        System.out.println(sonKelimeBul("kinlenmek güzel değildir"));
        System.out.println("............");
        System.out.println(yenilenenHarf("kelime"));

    }
    public static String  besKaraktereTamamla(String str,int number,char karakter) {

        String kelime="";
        if(str.length()>=number){
            return str.substring(0,number);
        }
       // int count=number-str.length();
        for (int i = str.length(); i <number ; i++) {
            str+=karakter;

        }return str;


    }public static boolean ilkIkiSonIkiHarf(String str){
       return str.substring(0,2).equals(str.substring(str.length()-2));
    }
    public static String sonKelimeBul(String isim){
      isim=isim.trim();
        return isim.substring(isim.lastIndexOf(" ")+1);




}
public static String yenilenenHarf(String str){
        String result=" ";
    for (int i = 0; i <str.length() ; i++) {
        if(result.contains(str.substring(i,i+1))){
            result+=str.substring(i,i+1);
        }

    }
return result;
}


        }




