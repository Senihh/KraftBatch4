package day_18_;

public class C02_CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("....................");
        countdownTenToZero();
        System.out.println("...............");
        evenNumbers();

    }

    /**
     *
     */
    public static void helloWorld5Times(){
        for (int i=1;i<=5;i++)
            System.out.println("Hello world");

    }
    public static void countdownTenToZero(){
        for (int i =10; i >=0; i--) {
            System.out.print(i+" ");
            
        }
        
    }
    public static void evenNumbers(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");

        }
    }
}
