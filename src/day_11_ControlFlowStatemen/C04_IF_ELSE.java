package day_11_ControlFlowStatemen;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[]args) {

Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");
int sayi= scan.nextInt();
if(sayi%2==0){
    System.out.println("çift");

}else{
    System.out.println("tek");
}
    }
    }