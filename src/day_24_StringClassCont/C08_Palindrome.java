package day_24_StringClassCont;

public class C08_Palindrome {
    public static void main(String[] args) {
        String word="civic";
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
          reverse= reverse.concat(word.substring(i,i+1));
        }
        System.out.println(reverse);

        boolean isPalindrome = reverse.equals(word);
        System.out.println("isPalindrome: " + isPalindrome);
    }
}
