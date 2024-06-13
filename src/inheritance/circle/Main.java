package inheritance.circle;

public class Main {
    public static void main(String[] args) {
      Cylinder c1 = new Cylinder();
      c1.setRadius(10);
      System.out.println(c1.getRadius());
      c1.setHeight(20);
      System.out.println(c1.getHeight());
      c1 = new Cylinder(2,2,"red");
      System.out.println(c1);
    }

}
