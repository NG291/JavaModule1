package Mang;

public class TinhTongDuongCheoChinhDuongCheoPhu {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36},
        };
        int sumcc=0;
        int sumcp=0;
        for(int i=0;i<arr.length;i++){
           sumcc+=arr[i][i];
           sumcp+=arr[i][arr[i].length-1-i];
        }
        int sum=sumcc+sumcp;
        System.out.println("Tong duong cheo chinh va duong cheo phu"+sum);
    }
}
