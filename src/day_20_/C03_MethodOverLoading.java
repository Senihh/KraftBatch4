package day_20_;

public class C03_MethodOverLoading {

    public static void main(String[] args) {
      double sum=sum(10,4,30,6);
        System.out.println("sum "+sum);

        double sum4=sum(16.5,14.7);
        System.out.println(sum4);


    }

    /*
Task1:
        1. create a method that can find the sum of two numbers


        2. create a method that can find the sum of three numbers


        3. create a method that can find the sum of four numbers


 */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }
    public static int sum(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
}
}
