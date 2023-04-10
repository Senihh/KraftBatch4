package day_21;

import java.util.Random;

public class C03_Fibonacci {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 24//
        //public static void fibonacci(){
        //  for(int i=0; i)

        Fibonacci(11);
        System.out.println();
        System.out.println("..............");
        System.out.println(FibonacciSonSayi(9));
        System.out.println("............");
        System.out.println(yaziTura());


    }

    public static void Fibonacci(int n) {
        int x = 0;
        int y = 1;
        int z;
        System.out.print(x + " ");
        System.out.print(y + " ");
        for (int i = 0; i < n - 2; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }

    public static int FibonacciSonSayi(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 0; i < n - 2; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;
    }

    public static String yaziTura() {
        Random random = new Random();
        int x=random.nextInt();
        if (x%2==0){
            return  "tura";
        }
        return "yazı";

    }

}
