package inheritance.shapetest;

public class Rectangle extends Shape {
    private double height = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * this.height;
    }
    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }
    public String toString(){
        return "A Rectangle with width= "
                +getWidth()
                +" and height= "
                +getHeight()
                +",which is a subclass of"
                +super.toString();
    }
}
