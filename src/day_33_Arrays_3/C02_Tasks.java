package day_33_Arrays_3;

public class C02_Tasks {
   // İnt arry in en büyük elemanının döndüren bir method yazın
   public static void main(String[] args) {
       int array[]={23,12,11,12,14};
       System.out.println(maxOfArray(array));
   }

    public static int maxOfArray(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];

            }
        }
return max;
    }
    public static int[] swapFirstAndLast(int []arr){
       int temp=arr[0];
       arr[0]=arr[arr.length-1];
       arr[arr.length-1]=temp;
       return arr;
    }
  public static int[] reverseArrsy(int[]arr){
       int[] reversedArr=new int[arr.length];
      for (int i = arr.length-1, j=0 ;i>=0; i--,j++) {
          reversedArr[arr.length-1-i]=arr[i];
      }
      return reversedArr;
  }


}
