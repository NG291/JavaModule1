package NhapMonJava;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter widthg: ");
        width=scanner.nextFloat();//Nhap chieu rong

        System.out.println("Enter height");
        height=scanner.nextFloat();//Nhap chieu cao
        float area=width*height;
        System.out.println("Area: "+area);
    }
}
