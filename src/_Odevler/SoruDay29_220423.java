package _Odevler;

public class SoruDay29_220423 {
    public static void main(String[] args) {
        String str = "kinlenmek";
        String str1 = "ekinler";
        String str2 = "verekinlenmek";
        String str3 = "kin";
        String str4 = "demdemde";
        System.out.println(yineleneniSil(str));
        System.out.println(tekKarakterleriYzdir(str));
        System.out.println(kacTane(str, "i"));

    }



    public static String yineleneniSil(String str) {
        //aabbbcccdeff    abcdef
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i)+"")) {
                result += str.charAt(i);

            }

        }
        return result;
    }
    public static String tekKarakterleriYzdir(String str){
        //aavvvbbbccfddeh   fh
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
              result+=ch;

            }

        }
        return result;
    }
    public static int kacTane(String str,String ch){
       int ilkSayi= str.length();
     int kalanSayi=  str.replace(ch,"").length();
   int chSayi=ilkSayi-kalanSayi;
     return chSayi;
    }
}