public class MyCircle {
    private MyPoint center;
    private double radius;

    public MyCircle() {
        center = new MyPoint(0, 0);
        radius = 1.0;
    }
    public MyCircle(double radius) {
        center = new MyPoint(0, 0);
        this.radius = radius;
    }
    public MyCircle(int x, int y, double radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
    @Override
    public String toString() {
        return "MyCircle[center=" + center
                + ", radius=" + radius + "]";
    }
}
