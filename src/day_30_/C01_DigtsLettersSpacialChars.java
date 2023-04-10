package day_30_;

public class C01_DigtsLettersSpacialChars {
    /*Create a method that takes a String and returns 3 different String
    of Letters, digits and special chars
     * of that string. space is not considered as a special char
    // "ABCDExyz1234567890) (*&^%$#@!"
    digitis=1234567890
    letters=ABCDExyz
    specialChars=)(*&^%$#@!

      */
    public static void main(String[] args) {
        sapperateCharacters( "ABCDExyz1234567890) (*&^%$#@!");
    }

public static void sapperateCharacters(String str){
    String letter="";
    String digits="";
    String specialChars="";

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        if (ch>='A'&&ch<='Z'){
            letter+=ch;
        }else if(ch>='a'&&ch<='z'){
            letter+=ch;

        }else if(ch>='0'&&ch<='9'){
            digits+=ch;

        }else{
            if(ch!=' '){
                specialChars+=ch;
            }
        }

        }
    System.out.println(letter);
    System.out.println(digits);
    System.out.println(specialChars);
    }
//tekrar
    public static void seperateCharacters(String  str){
        String letter="";
        String digits="";
        String spacialChars="";

        for (int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch>='A'&&ch>='Z'){
              letter+=ch;

          }else if(ch<='a'&&ch>='z'){
              letter+=ch;

            }else if(ch<='0'&&ch>'9'){
              digits+=ch;
          }else {
              if(ch!=' '){
                  spacialChars+=ch;
              }
          }

        }
        System.out.println(letter);
        System.out.println(digits);
        System.out.println(spacialChars);
    }
}


