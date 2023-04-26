package day_34_Arrays_4;

public class C03_ReverseSecondWord {
    public static void main(String[] args) {
        System.out.println(reverseSecondWord("I Love Java"));
    }


    public static String reverseSecondWord(String str) {
        /*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

 */
/*
       String result="";
       String []words=str.split(" ");

        String reversed="";
        for (int i =  words[1].length()-1;0<=i; i--) {
            reversed += words[1].charAt(i);
        }
            words[1]=reversed;
        for (String word : words) {
            result+=word+" ";

        }

            return result;
        */

        String result="";
        String reversed="";
        String[]strArrey=str.split(" ");
        for (int i = strArrey[1].length()-1; i >=0 ; i--) {
           reversed+=strArrey[1].charAt(i);
        }
        strArrey[1]=reversed;
        for (String word:strArrey){
            result+=word+" ";
        }
        return result;

        }


    }

