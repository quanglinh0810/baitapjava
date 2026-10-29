public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(1, 2, 4, 6);
        System.out.println("Doan thang: " + line);
        System.out.println("Diem dau: " + line.getBegin());
        System.out.println("Diem cuoi: " + line.getEnd());
        System.out.println("Toa do X diem dau: "
                + line.getBeginX());
        System.out.println("Do dai: "
                + line.getLength());
        System.out.println("Goc nghieng: "
                + line.getGradient());
    }
}
