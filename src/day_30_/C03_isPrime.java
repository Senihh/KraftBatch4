package day_30_;

import java.util.Scanner;

public class C03_isPrime {
    // Write a method that takes an integer and check if the number is prime and returns a boolean
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayi giriniz");
        int sayi=scan.nextInt();


        if (isPrime(sayi)){
            System.out.println(" prime");
        }else{
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(int num) {
        boolean isPrime = false;
        int factor = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factor++;
                break;
            }
        }
        if (num < 2) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else if (factor == 0) {
            isPrime =true;
        }else {
            isPrime=false;
        }




        return  isPrime;
    }
}
