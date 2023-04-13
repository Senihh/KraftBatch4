package day_31_Arrays_1;

public class C03_Array_2 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;
        System.out.println(array.length);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");

        }
        for (int x: array){
            System.out.print(x+" ");
        }
        {

        }
    }


}