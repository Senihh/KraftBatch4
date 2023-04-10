package day_29;

public class C03_RemoveDuplicates {

    /**
     * /Write a method that can remove the duplicated characters from a String
     *             Ex:
     *                 input:
     *                     AABBCCBC
     *
     *                 Output:
     *                     ABC
     *
     *             Hint: You can add each characters of the string into another String
     *                   Condition: the character is not contained in the other String yet before you are adding/
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AABBCCBC"));
        System.out.println("...........");
        System.out.println(tekrarEedenHarfler("AABBCCBC"));
    }

    public static String removeDuplicates(String str){
        String result="";
        for (int i=0;i<str.length();i++){
         if(!result.contains(str.charAt(i)+"")){
             result+=str.charAt(i);

         }
        }

        return result;
    }

    public static String tekrarEedenHarfler(String str){
        String result="";
        for (int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);
            if (!result.contains(ch)){
                result+=ch;
            }
        }
        return result;
    }

}
