package day_07_Artmetic_Operators;

import java.util.Scanner;

public class ScannerExample {
    public static void main (String[]args){

        Scanner scan=new Scanner(System.in);
        System.out.println("fizik notu:");
        int fizik= scan.nextInt();
        System.out.println("kimya notu:");
        int kimya= scan.nextInt();
        System.out.println("matematik notu:");
        int matematik= scan.nextInt();
        double toplam=((double)fizik+kimya+matematik)/3;
        System.out.println(toplam);
    }
}
