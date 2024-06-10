package Mang;

import java.util.Scanner;

public class ChuyenNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap fahrenheit");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Celsius to Fahrenheit");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit" + celsiusTofahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusTofahrenheit(double Celsius) {
        double fahrenheit = (9.0 / 5) * Celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double Fahrenheit) {
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        return Celsius;
    }

}

