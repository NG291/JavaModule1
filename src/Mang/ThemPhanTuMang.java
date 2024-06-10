package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri can them phan tu");
        int vitri = sc.nextInt();
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == vitri) {
                System.out.println("Nhap");
                int x = sc.nextInt();
                newArray[j] = x;
                j++;
            }
            newArray[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArray));


    }
}
