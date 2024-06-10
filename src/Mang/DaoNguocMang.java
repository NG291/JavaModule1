package Mang;

import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.Arrays;
import java.util.Scanner;
public class DaoNguocMang {
    public static void main(String[] args) {
        int n;
        int []arr;
        int temp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap kích thươc mang tu mang");
        n = sc.nextInt();
            if(n>6){
                System.out.println("Nhap lai đi cưng!");
            }
        }while (n>6);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu i: "+ i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       for (int j = 0; j < n/2; j++) {
               temp = arr[j];
               arr[j] = arr[n-j-1];
               arr[n-j-1] = temp;
           }
           System.out.println("ARR sau khi bị đảo ngược: " + Arrays.toString(arr));
       }
    }

