package vonglap;

import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextInt();
        System.out.println("Nhap b:");
        b=sc.nextInt();
        // Sử dụng hàm abs() để trả về giá trị tuyệt đối của a,b
        a =Math.abs(a);
        b =Math.abs(b);
        if(a==0|| b==0){
            System.out.println("Không có ước số chung");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("Uoc chung lon nha cua 2 so la:"+a);
    }
}
