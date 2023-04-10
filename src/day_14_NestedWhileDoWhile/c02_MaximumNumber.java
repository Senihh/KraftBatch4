package day_14_NestedWhileDoWhile;

import java.util.Scanner;

public class c02_MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num > max) ;{
            max=num;
            }
        }
        System.out.println("Max= "+ max);
    }
}

