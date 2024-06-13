package inheritance.triangle;

public class Triangle extends Shape {
    private double siz1 = 1.0;
    private double siz2 = 1.0;
    private double siz3 = 1.0;

    public Triangle() {
    }

    public Triangle(double siz1, double siz2, double siz3) {
        this.setSiz1(siz1);
        this.setSiz2(siz2);
        this.setSiz3(siz3);
    }

    public Triangle(double siz1, double siz2, double size, String color, boolean isFilled) {
        super(color, isFilled);
        this.setSiz1(siz1);
        this.setSiz2(siz2);
        this.setSiz3(size);
    }

    public double getSiz1() {
        return siz1;
    }

    public void setSiz1(double siz1) {
        this.siz1 = siz1;
    }

    public double getSiz2() {
        return siz2;
    }

    public void setSiz2(double siz2) {
        this.siz2 = siz2;
    }

    public double getSiz3() {
        return siz3;
    }

    public void setSiz3(double siz3) {
        this.siz3 = siz3;
    }

    public double getPerimeter() {
        return (siz1 + siz2 + siz3) / 2;
    }

    public void setPerimeter(double siz1, double siz2, double siz3) {
        this.siz1 = siz1;
        this.siz2 = siz2;
        this.siz3 = siz3;
    }

    public double getArea() {
        double p = getPerimeter();
        double s = p*(p-siz1)*(p-siz2)*(p-siz3);
        return Math.sqrt(s);
    }

    @Override
    public String toString() {
        return "Triangle{"+"size: " + siz1+
                ",siz2: "+ siz2+
                ",siz3: "+siz3+
                ",color: "+ getColor()+
                (isFilled() ? "filled" : "nonFilled");
    }
}
