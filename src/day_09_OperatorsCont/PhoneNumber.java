package day_09_OperatorsCont;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[]args){



        Scanner scan=new Scanner(System.in);

        System.out.println("Country Code : ");
        int contryCode=scan.nextInt();

        System.out.println("Area Code : ");
        int areaCode=scan.nextInt();

        System.out.println("Local Number : ");
        int localNumber=scan.nextInt();

        System.out.println("Girmiş olduğunuz numara:"+ contryCode + areaCode+ localNumber);



}
}