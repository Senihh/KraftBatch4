package mentoring_day_05;

import java.util.Scanner;

public class C03_InToString {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");

        int number= scan.nextInt();
        boolean ciftmi=number%2==0;
        boolean tekmi=number%2!=0;

        System.out.println(number+" Sayısı çift mi "+ ciftmi);
        System.out.println(number + " Sayısı tek mi " + tekmi);


    }
}
