package day_32_Arrays_2;

public class C01_Arrays_2 {
    public static void main(String[] args) {
        String arr[]=new String[4];
        arr[0]="Harun";
        arr[1]="Mehmet";
        arr[2]="Celal";
        arr[3]="Emine";
        System.out.println(arr[3]);
        //String arr[]={"Harun","Mehmet","Celal","Emine"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            for (String str:arr){
                System.out.print(str+" ");
        }

    }
}
