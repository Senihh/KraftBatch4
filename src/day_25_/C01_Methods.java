package day_25_;

public class C01_Methods {








    public static char sonDeger2(String str) {
        return str.charAt(str.length() - 1);
    }
    public static String sonDeger3(String str){
        return str.substring(str.length()-1);
    }

  public static int max(int a,int b){
        if(a>b){return a;}
        return b;
  }
public static int sum(int x,int y){
        return x+y;
}
public static String ucEkle(String str){
        return str+"3";
}
    public static void main(String[] args) {
String str1="harun";
        System.out.println(contain(str1, "a"));


    }
public static boolean contain(String str,String deger){
        return str.contains(deger);

}

}



