public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(23, 59, 58);
        System.out.println("Ban dau: " + t1);
        t1.nextSecond();
        System.out.println("Sau 1 giay: " + t1);
        t1.nextSecond();
        System.out.println("Sau them 1 giay: " + t1);
        t1.previousSecond();
        System.out.println("Lui 1 giay: " + t1);
        t1.setTime(10, 20, 0);
        System.out.println("Dat lai: " + t1);
        t1.previousSecond();
        System.out.println("Lui 1 giay: " + t1);
    }
}
