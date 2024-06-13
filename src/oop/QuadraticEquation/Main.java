package oop.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        double a = input.nextDouble();
        System.out.println("Nhap so b");
        double b = input.nextDouble();
        System.out.println("Nhap so c");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println(quadraticEquation.toString());
        if (delta > 0) {
            System.out.println("The equation has two root" + quadraticEquation.getRoot1() + "and" + quadraticEquation.getRoot2());
        } else if (delta < 0) {
            System.out.println("Khong co nghiem");
        } else {
            System.out.println("The equation has one root" + quadraticEquation.getRoot());
        }


    }
}
