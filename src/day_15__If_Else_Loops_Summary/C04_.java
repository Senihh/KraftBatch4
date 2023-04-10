package day_15__If_Else_Loops_Summary;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
       /* Örnek 6:
        Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
      */
       for(int i=0,k=1;i<=5;i++){
           for (int j=0;j<=i;j++){
               System.out.print(k+" ");
                k++;
           }
           System.out.println();
       }

    }
}
