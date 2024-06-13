package nhapmonjava;

import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which month that you to count dáy?");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print("the month '2' has 28 or 29 days!");
                break;
            case 1:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 3:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 4:
                System.out.print("The month" + month + "has 30 days!");
                break;
            case 5:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 6:
                System.out.print("The month" + month + "has 30 days!");
                break;
            case 7:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 8:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 9:
                System.out.print("The month" + month + "has 30 days!");
                break;
            case 10:
                System.out.print("The month" + month + "has 31 days!");
                break;
            case 11:
                System.out.print("The month" + month + "has 30 days!");
                break;
            case 12:
                System.out.print("The month" + month + "has 31 days!");
            default:
              System.out.print("Invalid input");
              break;
        }
    }

}
