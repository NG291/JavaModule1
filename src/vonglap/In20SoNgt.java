package vonglap;

import java.util.Scanner;

public class In20SoNgt {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if(number %2==0){
            return false;
        }

        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("So nguyen number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
       for(int i=0; ;i++){
           if(isPrime(i)){
               System.out.println(i);
               count++;
               if (count == n) {
                   break;
               }
           }

        }
    }

}

