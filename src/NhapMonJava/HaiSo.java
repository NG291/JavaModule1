package NhapMonJava;

import java.util.Scanner;

public class HaiSo {
    public static void main(String[] args) {
        System.out.println("Hai So");
//        Viet chuong tirnh nhap vao tu ban phim 2 so a,b;
//        Tinh tong cac so tu a->b;
        Scanner scanner= new Scanner(System.in);
        int a,b, sum = 0;
        do {
            System.out.print("Nhap so a");
            a =scanner.nextInt();
            System.out.print("Nhap so b");
            b = scanner.nextInt();
        } while (a > b);

        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System .out.println("Tong a+b "+sum);

    }
}
