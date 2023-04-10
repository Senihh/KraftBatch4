package mentoring_day_05;

import java.util.Scanner;

public class C04_Task {
    public static void main(String []args){

        System.out.println("Lütfen bir sayı giriniz: ");
        Scanner scan=new Scanner(System.in);

        int number1=scan.nextInt();
        int number2=scan.nextInt();
        boolean fark=(number1-number2)%2!=0;

        System.out.println(" farkı "+(number1 - number2) + " olan sayı tek sayı mıdır." + fark  );
    }
}
