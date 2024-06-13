package mang;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Nhap so nguyen can xoa trong mang");
        int Xoa = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Xoa) {
                index = i;
                System.out.println("Vi tri xoa trong mang" + index);
            }
        }
        int[] a = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == Xoa) {
                continue;
            }
            a[j++] = arr[i];
        }
        System.out.println(Arrays.toString(a));
    }
}

