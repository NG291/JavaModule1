package VongLap;

public class SngtMin100 {
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
        for(int i=1;i<=100;i++){
            if(isPrime(i)){
                System.out.println("So nguyen dươi 100"+i);
            }

        }
    }
}
