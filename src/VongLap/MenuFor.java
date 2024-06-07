package VongLap;

import java.util.Scanner;

public class MenuFor {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh vuong");
        System.out.println("2. Hinh tam giac vuong botton-left:");
        System.out.println("3. Hinh tam giac vuong top-left");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    case 0:
                        System.out.println("Goodbye!");
                        break;
            default:
                System.out.println("hiiiiiiiii");
        }
    }
}
