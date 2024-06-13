package inheritance.shapetest;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("red", false);
        System.out.println(s2);
        Circle c1 = new Circle();
        System.out.println(c1);
        c1 = new Circle(3.5);
        System.out.println(c1);
        c1 = new Circle(3.5, "indigo", false);
        System.out.println(c1);
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        r1 = new Rectangle(2.3, 5.8);
        System.out.println(r1);
        r1 = new Rectangle(2.3, 5.8, "orange", true);
        System.out.println(r1);
    }
}
