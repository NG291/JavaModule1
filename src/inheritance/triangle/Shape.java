package inheritance.triangle;

public class Shape {
    private String color="red";
    private boolean filled= true;
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled="+
                 (isFilled() ? "filled" : "nonFilled");

    }
}
