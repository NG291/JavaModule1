package Mang;

public class TinhTongCacSoCotTrongMang {
    public static void main(String[] args) {
        int [][] array={
                {1,2,4},
                {5,15,8},
                {7,3,9},
                {10,11,12}
        };
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(j== 1){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}