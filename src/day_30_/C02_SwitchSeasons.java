package day_30_;

import java.util.Scanner;

public class C02_SwitchSeasons {
    // Write a method that takes the month number from the user and returns the season.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1-12 arası bir sayı giriniz");
        int month=scan.nextInt();
        System.out.println(whichSeason(month));
    }
public static String whichSeason(int mont){
    String season="";
    switch (mont){
        case 12,1,2:
            season="Winter";
            break;
        case 3,4,5:
            season="Spring";
            break;
        case 6,7,8:
            season="Summer";
            break;
        case 9,10,11:
            season="Fall";
            break;
        default:
            season="Invalid Month Number";
    }
    return season;
}
    }


