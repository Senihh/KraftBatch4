package day_17_Methods;

public class C03_Methods_01 {
    public static void main(String[] args) {
        message_3();
   /*
     hello();
    }
        public static void hello () {
            menu();
            System.out.println("hello word");
        }
        public static void menu () {

            System.out.println("1: para çekme 2:para çek 3: bakiye görüntüle 4:çıkış");

    */
        }

        public static void message_1(){
        message_3();
            System.out.println("1");

        }
    public static void message_2(){
        message_1();
        System.out.println("2");

    }
    public static void message_3() {
        System.out.println("3");
        message_2();
    }

}
