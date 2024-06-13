package nhapmonjava;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap so tien VNd: ");
        usd=sc.nextDouble();
        double Qd=usd*vnd;
        System.out.println("VND: "+Qd);

    }
}
