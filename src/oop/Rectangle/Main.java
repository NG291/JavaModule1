package oop.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu dai");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hinh chu nhat ban can tinh: \n"+rectangle.display());
        System.out.println("Dien tich hinh chu nhat: "+rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat: "+rectangle.getPerimeter());
    }
}
