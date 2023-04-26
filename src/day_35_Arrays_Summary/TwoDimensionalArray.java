package day_35_Arrays_Summary;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] str=new String[3][2];
       str[0][0]= "Harun";
       str[0][1]= "Mehmet";
       str[1][0]= "ziya";
       str[1][1]= "Ayşe";
       str[2][0]= "Ali";
       str[2][1]= "bekir";


        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                System.out.print(str[i][j] + " ");

            }
            System.out.println();

        }


    }
}
