package Mang;

import java.util.Scanner;

public class DemChuoi {
    public static void main(String[] args) {
        char[] CH={'a','a','a','b','b','b'};
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ki tu can tim");
        char input=sc.next().charAt(0);
        boolean flag=false;
        int index=0;
        for(int i=0;i<CH.length;i++){
            if(input==CH[i]){
                System.out.println(CH[i]);
                index++;
                flag=true;
            }
        }
        if(!flag){
            System.out.println("khong co ki tu ban muon tim");
        }
        else {
            System.out.println("So luong ki tu ban can la: " +index);
        }
    }
}
