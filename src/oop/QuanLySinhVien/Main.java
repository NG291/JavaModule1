package oop.QuanLySinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySV ql = new QuanLySV(10);
        while (true) {
            printMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    ql.ShowStudent();
                    break;
                case 2:
                    ThemSV(sc, ql);
                    break;
                case 3:
                    XoaSv(sc, ql);
                    break;
                case 4:
                    SuaSv(sc, ql);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1.Hien thi ds.");
        System.out.println("2.Them sv.");
        System.out.println("3.Xoa sv.");
        System.out.println("4.Sưa sv.");
        System.out.println("0.Exit.");
    }

    public static void ThemSV(Scanner sc, QuanLySV ql) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phone = sc.nextLine();
        System.out.println("Nhap Diem trung binh: ");
        int GPA = Integer.parseInt(sc.nextLine());
        Student sv = new Student(id, name, email, phone, GPA);
        ql.addStudent(sv);
    }

    public static void XoaSv(Scanner sc, QuanLySV ql) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        Student sv = ql.EditStudent(id);
        if (sv == null) {
            System.out.println("Khong co sv");
            return;
        }
        ql.DeleteStudent(sv);
    }

    public static void SuaSv(Scanner sc, QuanLySV ql) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        Student sv = ql.EditStudent(id);
        if (sv == null) {
            System.out.println("Khong co sv");
            return;
        }
        System.out.println("Ten moi: ");
        String name = sc.nextLine();
        sv.SetName(name);
    }
}
