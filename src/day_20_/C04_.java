package day_20_;

public class C04_ {
    public static void main(String[] args) {
        calculateArea(2,4);
        calculateArea(3);
    }

    public static void calculateArea(int a,int b) {
        System.out.println(a*b);



    }
    public static void calculateArea(int radius) {
        System.out.println(Math.round(Math.PI*radius*radius));
}
}