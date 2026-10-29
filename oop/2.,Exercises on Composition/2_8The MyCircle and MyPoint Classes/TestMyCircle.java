public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(3, 4, 2.0);
        MyCircle c2 = new MyCircle(6, 8, 1.0);
        System.out.println("Hinh tron 1: " + c1);
        System.out.println("Ban kinh: " + c1.getRadius());
        System.out.println("Toa do tam: "
                + c1.getCenterX() + ", "
                + c1.getCenterY());
        System.out.println("Dien tich: " + c1.getArea());
        System.out.println("Chu vi: " + c1.getCircumference());
        System.out.println("Khoang cach hai tam: "
                + c1.distance(c2));
    }
}
