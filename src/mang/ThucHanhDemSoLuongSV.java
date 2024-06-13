package mang;

import java.util.Scanner;

public class ThucHanhDemSoLuongSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cout=0;

    do{
        System.out.println("Nhap so luong sinh vien");
         n = sc.nextInt();
        if(n>30){
            System.out.println("Nhap lai!");

        }
    }while (n>30);
    int[] array= new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Nhap diem sinh vien thư: "+(i+1) );
        array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(array[i]>=5&&array[i]<=10){
            cout++;
        }
    }
    System.out.println("So luong sinh vien do: "+cout);
    }

}
