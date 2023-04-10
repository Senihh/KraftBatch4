package mentoring_day_06_Loops;

public class C01_WhileLoops {
    public static void main(String[] args) {

        int i=1;
        while (i<=4) {
            System.out.println("Hi"+i);
            int j=1;
            while (j<=3) {
                System.out.println("Hello "+j);
                j++;
            }
            i++;
        }

    }
}
