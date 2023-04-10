package day_20_;

public class C02_SumOfNumbers {
    public static void main(String[] args) {
        int sum= sumOf2Numbers(10,20);
        System.out.println("sum= "+sum);

        int sum2=somOf3Numbers(10,20,30);
        System.out.println("sum2= "+sum2);

        int sum3=somOf4Numbers(10,20,30,40);
        System.out.println("sum3= "+ sum3);

    }
    /*
Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */

    /**
     * create a method that can find the sum of two numbers
     *                         method name: sumOf2Numbers
     * @param num1
     * @param num2
     * @return
     */
    public static int sumOf2Numbers(int num1,int num2){
        return num1+num2;
    }

    /**
     * create a method that can find the sum of three numbers
     *                         method name: sumOf3Numbers
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int somOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num2;
    }

    /**
     * create a method that can find the sum of four numbers
     *                         method name: sumOf4Numbers
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @return
     */
    public static int somOf4Numbers(int num1, int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }


}
