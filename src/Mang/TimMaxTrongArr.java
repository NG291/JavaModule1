package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxTrongArr {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng");
            n = sc.nextInt();
            if (n > 6) {
                System.out.println("Nhap lai đi cu");
            }
        } while (n > 6);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri mang thu:"+i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index= j+1;
                }
            }
        }
        System.out.println("Gia tri max: "+ max + "Vi tri thứ:"+ index);
    }
}
