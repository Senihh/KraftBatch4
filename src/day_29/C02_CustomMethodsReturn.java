package day_29;

public class C02_CustomMethodsReturn {
    public static void main(String[] args) {
        System.out.println(printNumbers(45, 55));
    }


    public static String printNumbers(int x,int y) {
        String result = "";
        for (int i = x + 1; i < y; i++) {
            result +=i+" ";
        }
        return result;
    }
}