package day_18_;

public class C03_CostumMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        System.out.println("..................");
        ageOfPerson(1983);
        System.out.println("..................");
     printNumber(1,5);
    }

    /**
     * a function that can check if a number is odd number or even number
     * @param number
     */
    public static void oddOrEven(int number){
        if (number%2==0)
            System.out.println(number+" is even number");
        else
            System.out.println(number+" is an old number");



    }
//     a method that can display the age of the person from the birthYear

    /**
     * a method that can display the age of the person from the birthYear
     * @param birtYear
     */
    public static void ageOfPerson(int birtYear){
        int age=2023-birtYear;
        System.out.println("your age is "+ age);
    }


//     a method that can print all the numbers between X and Y

    /**
     * a method that can print all the numbers between x and y
     * @param x
     * @param y
     */
    public static void printNumber(int x,int y){
        for (int i=x+1;i<y;i++){
            System.out.println(i+" ");
        }


    }


}
