public class Circle {
    double radius;
    String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius
                + ",color=" + color + "]";
    }
}