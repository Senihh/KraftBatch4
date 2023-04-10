package day_19_CustomMethodsRetorn;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        System.out.println(initials("ömer", "ünlü"));


    }
    /**
     * //1. Create a method that can display the initials of the person.
     * initials(String firstName, String lastName)
     */

    public static String initials(String firtName, String lastName){
        String result="";
        result=firtName.charAt(0)+ " "+ lastName.charAt(0);
        return result;

    }
}
