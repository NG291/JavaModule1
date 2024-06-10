package NhapMonJava;

import java.util.Scanner;

public class UngDungSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can doc: ");
        int number = sc.nextInt();
        if (number < 10 && number >= 0) {
            System.out.println(readOneDigit(number));
        } else if (number < 20 && number >= 10) {
            System.out.println(readTowDigitsLessThan20(number));
        } else if (number < 100 && number >= 20) {
            System.out.println(readTowDigits(number));
        } else if (number < 1000 && number >= 100)
        {
            System.out.println(readThreeDigit(number));
        }
        else {
            System.out.println("out of ability");
        }
        sc.close();
}
public static String readOneDigit(int number) {
        switch (number){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
           default: return "out of ability";
        }
}
public static String readTowDigitsLessThan20(int number) {
        switch (number){
            case 10: return"ten";
            case 11 : return "eleven";
            case 12 : return "twelve";
            case 13 : return "thirteen";
            case 14 : return " fourteen";
            case 15 : return "fifteen";
            case 16: return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "nineteen";
            default: return "out of ability";
        }
}
public static String readTens(int tens) {
        switch (tens) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "out of ability";
        }
}
public static String readTowDigits(int number) {
        int tens=number/10;
        int ones=number%10;
        if(ones==0){
            return  readTens(tens);
        }
        else {
            return readTens(tens) + " "+ readOneDigit(ones);
        }
}
public static String readThreeDigit(int number) {
        int hundreds = number/100;
        int remainder = number%100;
        if(remainder==0){
            return readTens(hundreds) + "hundred";
        }
        else {
            return readOneDigit(hundreds) + " hundres "+ readTowDigits(remainder);
        }
}
}
