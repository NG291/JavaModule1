package abstractinterface.circleComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle();
        circles[2] = new Circle("Hi you",false,3.5);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        CircleComparator c=new CircleComparator();
        Arrays.sort(circles,c);
        System.out.println("After sort:");
        for(Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
