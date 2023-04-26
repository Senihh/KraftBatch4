package day_35_Arrays_Summary;

import java.util.Arrays;

public class labContinue {
    public static void main(String[] args) {
        //2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
        int[]array1={5,4,3,2,11
        };
        int[]array2={5,4,3,2,1,7,6,8,9};
        System.out.println(ikinciArraydeVarMi(array1, array2));
        System.out.println(Arrays.toString(createArray(15, 8)));
    }
    public static int[] createArray(int x,int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int []resultArray=new int[max-min+1];
        for (int i = min,j=0; i <=max ; i++,j++) {
            resultArray[j]=i;

        }
        return resultArray;

    }
    public static boolean ikinciArraydeVarMi(int[]arr1,int[]arr2){
      firstLoop:  for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    continue firstLoop;
                }

            }
            return false;
        }
        return true;
    }
}
