package day_29;

public class C01 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AABBCCBC"));
        System.out.println("..................");
printNumbers(23,44);

    }
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
    public static String removeDuplicates(String str){
        String result="";
        for(int i=0;i<str.length();i++){
         if(!str.contains(str.charAt(i)+""));
    result+=str;
        }
        return result;
    }
    public static void printNumbers(int X,int Y){
   for(int i=X;i<Y;i++){
       System.out.print(i+" ");
        }

        }
    }

