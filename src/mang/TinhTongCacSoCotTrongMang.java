package mang;

import java.util.Scanner;

public class TinhTongCacSoCotTrongMang {
    public static void main(String[] args) {
        int [][] array={
                {1,2,4},
                {5,15,8},
                {7,3,9},
                {10,11,12}
        };
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Nhap vi trí số cột cần tính:");
        int indexCot= sc.nextInt();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(j== indexCot){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}