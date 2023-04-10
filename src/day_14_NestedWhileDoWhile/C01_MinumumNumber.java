package day_14_NestedWhileDoWhile;

import java.util.Scanner;

public class C01_MinumumNumber {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        System.out.println(min);

        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if (num < min) {
                min=num;
            }
            }
        System.out.println("min= "+min);
        }
    }

