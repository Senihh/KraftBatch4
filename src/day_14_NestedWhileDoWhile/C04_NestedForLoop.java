package day_14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        for (int i=6;i>=0;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
