package vonglap;

import java.util.Scanner;

public class TinhLaiTien {
    public static void main(String[] args) {
        double money =1.0;
        int month=1;
        double interest =1.0;
//   Tạo đối tượng input thuộc lớp Scanner để thực hiện nhập dữ liệu cho 3 biến đã khai báo từ bàn phím
        Scanner input= new Scanner(System.in);
        // Nhập số tiền gửi
        System.out.println("Enter invertment amount: ");
        money = input.nextDouble();
        // Nhập số tháng gửi
        System.out.println("Enter number of months:");
        month= input.nextInt();
        //Lãi xuất
        System.out.println("Enter interest:");
        interest= input.nextDouble();
        double totalInterest=0;
        for(int i=0; i<month; i++){
            totalInterest+=money*(interest/100)/12*month;
        }
        System.out.println("Total interest: "+totalInterest);
    }
}
