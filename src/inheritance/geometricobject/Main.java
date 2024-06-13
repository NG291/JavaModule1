package inheritance.geometricobject;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(1);
        c.setFilled(true);
        System.out.println("A circle"+ c.toString());
        System.out.println("The radius is "+ c.getRadius());
        System.out.println("The area is "+ c.getArea());
        System.out.println("The perimeter is "+ c.getPerimeter());
        System.out.println();
        Rectangle r= new Rectangle(2,4);
        System.out.println("A rectangle"+ r.toString());
        System.out.println("The area is "+ r.getArea());
        System.out.println("The perimeter is "+ r.getPerimeter());
        System.out.println();
    }
}
