package mentoring_day_06_Loops;

import java.util.Scanner;

public class c04_Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. vize notunuzu giriniz: ");
        double vizeNotu1=scan.nextDouble();
        System.out.println("Lütfen 2. vize notunuzu giriniz: ");
        double vizeNotu2=scan.nextDouble();
        System.out.println("Lütfen final notunuzu giriniz: ");
        double finalNotu=scan.nextDouble();

        double ort=(vizeNotu1+vizeNotu2)*0.2+(finalNotu)*0.6;
        System.out.println("ortalama= "+ ort);
/*
if (ort>=90){
    System.out.println("A");
} else if (ort>=80) {
    System.out.println("B");
}else if(ort>=70){
    System.out.println("C");
}else if(ort>=60) {
    System.out.println("D");
}else if(ort>=40) {
    System.out.println("E");
}else {
    System.out.println("F");

}
*/
String not=(ort>=90)?"A":(ort>=80)?"B":(ort>=70)?"C":
        (ort>=60)?"D":(ort>=40)?"E":(ort<40&&ort>=0)?"F":"Invalid Number";
        System.out.println("not " + not);
    }

    }

