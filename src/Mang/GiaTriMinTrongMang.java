package Mang;

public class GiaTriMinTrongMang {
    public static void main(String[] args) {
     int[] arr={1,2,3,0,5,6,7,};
     System.out.println("Gia tri min trong mang là:"+arr(arr));

    }
    public static int arr(int[] array){
         int index=0;
        for(int i=1; i<array.length; i++){
            if (array[i] < array[index]){
                index=i;
            }
            }
        return  array[index];
        }

}
