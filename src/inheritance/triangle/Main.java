package inheritance.triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle =new Triangle(2.0,4.0,4.0,"red",true);
        System.out.println(triangle.toString());
        System.out.println("Diện tích hình tam giác:"+triangle.getArea());
        System.out.println("Chu vi hình tam giác: "+triangle.getPerimeter());
    }
}
