package mang;

public class TimPhanTuMaxTrongMang2Chieu {
    public static void main(String[] args) {
        int [][] array={
                {1,2,4},
                {5,6,8},
                {7,3,9},
                {10,11,12}
        };
        int max=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
