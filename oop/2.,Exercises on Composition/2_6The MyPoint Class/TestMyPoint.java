import java.util.Arrays;
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        System.out.println(
            "XY is: " + Arrays.toString(p1.getXY())
        );
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        p2.setXY(3, 4);
        System.out.println("Updated p2: " + p2);
        System.out.println(
            "Distance to (5, 6): " + p1.distance(5, 6)
        );
        System.out.println(
            "Distance p1 to p2: " + p1.distance(p2)
        );
        System.out.println(
            "Distance to origin: " + p1.distance()
        );
    }
}
