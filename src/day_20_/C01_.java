package day_20_;

public class C01_ {

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(9));

    }
    public static String nameOfDay(int number){

        String result="";




        if(number<1 || number>7){
            result="Invalid";
        } else if (number==1) {
            result="Monday";
        }
        return result;
        }
    }

