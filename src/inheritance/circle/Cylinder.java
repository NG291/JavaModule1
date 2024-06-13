package inheritance.circle;

public class Cylinder extends Circle {
protected double height;
public Cylinder() {}
    public Cylinder(double height) {
    this.setHeight(height);
    }
    public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getPremimeter()  {
    return height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
