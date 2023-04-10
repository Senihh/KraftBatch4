package day_19_CustomMethodsRetorn;

public class C01_PractiseTask2 {
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println("...................");
        eachCharInString("yazalım");
        System.out.println("....................");
        calculator(10,2,'*');
        calculator(23,44,'/');
        calculator(44,33,'%');
    }

    /**
     *
     * @param TL
     */
    public static void tlToDollar(int TL){
        System.out.println(TL+ " TL makes "+Math.round(TL/19.84)*100/100.0+ " USD");

    }
    public static double kgToLb(double kg){
        double result=0;
        result=Math.round(kg*20462262);
        return result;
    }
    /**
     *   3. create a method that can if the given integer is positive, negative or zero
     */
public static void signOfNumber(int number){
    if(number<0)             System.out.println(number+" is a negatve number");
    else if (number>0)       System.out.println(number+" is a positive number");
    else                     System.out.println(number+" is zero");


}
public static void eachCharInString(String str){
for(int i=0; i<str.length();i++){
    System.out.print(str.charAt(i)+" ");
}

}
/**
 * //  5. create a method named calculator that passes three arguments (num1, num2, mathOperator),
 * //    prints the calculation result
 */
public static void calculator(double num1,double num2,char mathOperator){
    boolean valid =mathOperator =='+' || mathOperator=='-' || mathOperator=='*' || mathOperator== '/';
    if(valid){
        switch (mathOperator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);

        }
    }else {
        System.err.println("Invalid Math Operator"+ mathOperator);
    }
}



}


