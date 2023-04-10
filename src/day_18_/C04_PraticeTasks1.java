package day_18_;

public class C04_PraticeTasks1 {
    //    1. create a method that can print odd numbers between 1~100 in a same line saperated by space
//    2. create a method that can print even numbers between 1~100 in a same line saperated by space

    //    3. create a method that can check if a person is eligible to buy alcohol




    public static void main(String[] args) {

        eligibileToVote(17,"tr");
        System.out.println(".....................");
        areaOfCircle(2);
        System.out.println("..................");
        areaOfSquare(5);
        System.out.println(".......................");
        dollarToTL(1433);

    }


    /**
     * 4. create a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */
    public static void eligibileToVote(int age,String citizenship){
       boolean isEligible= age>=18 && citizenship.equalsIgnoreCase("TR");
        System.out.println("You are ");
        if(!isEligible)
            System.out.print(" not ");
        System.out.print(" eligible to vate");


        /**
         *  5. create a method that can calculate the grade of the student based on the score
         * score >= 90 grade 'A'
         *  score >= 80 grade 'B'
         * score >= 70 grade 'C'
         * score >= 60 grade 'D'
         * score < 60 grade 'F'
         */
    }

    public static void grades(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'F';
        }
            System.out.println("Your scare is " + score + " and your grade is " );

        }

    /**
     * //    6. create a method that can calculate the area of a circle
     */
    public static void areaOfCircle(int radius){
        double area;
        area=(int)Math.PI*radius*radius;
        System.out.println("Circle with a radius "+ radius+ "cm has an area of "+ area);


    }


    /**
     * //    7. create a method that can calculate the area of a square
     * @param side
     */
    public static void areaOfSquare(int side){
        System.out.println("Square with a side of "+side+" cm has an area of "+(side*side)+"cm²");
    }
    /**
     *  8. create a method that can convert dollar to TL rate:19.04
     */
    public static void dollarToTL(int dollar){
        System.out.println(dollar+" doolar is "+(19.04*dollar)+" TL");
    }

    }


