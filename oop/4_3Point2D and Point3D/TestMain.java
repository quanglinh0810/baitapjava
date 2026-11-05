public class TestMain {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.1f, 2.2f);
        System.out.println(p1);
        p1.setXY(3.3f, 4.4f);
        System.out.println(p1);
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        Point3D p2 = new Point3D(5.5f, 6.6f, 7.7f);
        System.out.println(p2);
        p2.setXYZ(8.8f, 9.9f, 10.1f);
        System.out.println(p2);
        System.out.println("Z: " + p2.getZ());
        float[] arr = p2.getXYZ();
        System.out.println("X: " + arr[0]);
        System.out.println("Y: " + arr[1]);
        System.out.println("Z: " + arr[2]);
    }
}