package mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] Student = {"1", "2", "3", "4", "5", "6", "7", "5"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim");
        String inputName = sc.nextLine();
        boolean kt = false;
        for (int i = 0; i < Student.length; i++) {
            if (Student[i].equals(inputName)) {
                System.out.println("ket qua ban can tim la:" + Student[i] + "Vi tri" + i);
                kt = true;
                break;
            }

        }
            if (!kt) {
                System.out.println("Khong co ket quan ban can tim");
            }

    }
}
