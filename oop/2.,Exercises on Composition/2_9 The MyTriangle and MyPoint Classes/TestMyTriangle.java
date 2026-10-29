public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(
                0, 0,
                3, 0,
                0, 4
        );
        System.out.println("Tam giac 1: " + t1);
        System.out.println("Chu vi: " + t1.getPerimeter());
        System.out.println("Loai: " + t1.getType());
        MyTriangle t2 = new MyTriangle(
                0, 0,
                2, 0,
                1, 2
        );
        System.out.println("Tam giac 2: " + t2);
        System.out.println("Chu vi: " + t2.getPerimeter());
        System.out.println("Loai: " + t2.getType());
    }
}
