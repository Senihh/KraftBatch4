package day_10_UneryLogicalOperAndReview.Dat10_ClassNotes;

public class C04_UnaryOperators {
    public static void main(String[]args){

        int num1=+3;
        int num2=-2;

        System.out.println(num1>0);
        System.out.println(num2>0);

        System.out.println("..........................");

        int a=10;
        ++a; //pre increment: sayının değerini hemen bir artırıyor.
        System.out.println(a);

        --a; //pre decrement

        System.out.println(a);

        System.out.println("............................");

        int b=99;
        System.out.println(++b); //pre increment
        System.out.println(b++); //post increment
        System.out.println(b);

        int x=201;
        System.out.println(--x); //pre decrement
        System.out.println(x--); //post decrement
        System.out.println(x);


        System.out.println("..................");

        int z=44;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int i=42;
        System.out.println(--i);


    }
}
