package day_29;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBBC", 'A'));


    }



    /**
     * /Write a method that can return the frequency of a char from a String
     *
     *             Ex:
     *                 str = "AAABBBC" ch = 'A'
     *
     *             Output:
     *                 3/
     */

    public static int frequencyOfChars(String str,char ch){
        int freg=0;
        for (int i=0;i<str.length();i++){
            char eaChar=str.charAt(i);
            if(eaChar==ch){
                freg++;
            }

        }
        return freg;
    }
}
