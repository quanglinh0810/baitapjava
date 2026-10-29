public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    public MyTriangle(int x1, int y1,
                      int x2, int y2,
                      int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1,
                      MyPoint v2,
                      MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyPoint getV1() {
        return v1;
    }
    public MyPoint getV2() {
        return v2;
    }
    public MyPoint getV3() {
        return v3;
    }
    private double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2);
    }
    public double getPerimeter() {
        double a = distance(v1, v2);
        double b = distance(v2, v3);
        double c = distance(v3, v1);

        return a + b + c;
    }
    public String getType() {
        double a = distance(v1, v2);
        double b = distance(v2, v3);
        double c = distance(v3, v1);
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Khong phai tam giac";
        }
        double eps = 1e-9;
        boolean ab = Math.abs(a - b) < eps;
        boolean bc = Math.abs(b - c) < eps;
        boolean ca = Math.abs(c - a) < eps;
        if (ab && bc) {
            return "Tam giac deu";
        } else if (ab || bc || ca) {
            return "Tam giac can";
        } else {
            return "Tam giac thuong";
        }
    }
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1
                + ", v2=" + v2
                + ", v3=" + v3 + "]";
    }
}
