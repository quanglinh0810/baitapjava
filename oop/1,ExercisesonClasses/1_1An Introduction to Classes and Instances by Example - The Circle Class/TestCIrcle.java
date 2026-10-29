public class Testcircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());
        Circle c3 = new Circle(3.5, "blue");
        System.out.println(c3);
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Color: " + c3.getColor());
        System.out.println("Area: " + c3.getArea());
        c3.setRadius(5);
        c3.setColor("green");
        System.out.println("Sau khi thay đổi:");
        System.out.println(c3);
    }
}
