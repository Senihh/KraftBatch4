package day_24_StringClassCont;

public class C09_UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccd";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        System.out.println(result);


        }
    }
