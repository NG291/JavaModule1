package mang;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thước của mảng");
        int size= sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Nhap vao gia trị của mảng thứ: " +i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Phân tu nho nhat trong mang:"+ min);
    }
}
