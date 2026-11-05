public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Linh", "Da Nang");
        System.out.println("===== PERSON =====");
        System.out.println(p1);
        Student s1 = new Student(
                "Quang Linh",
                "Da Nang",
                "Artificial Intelligence",
                1,
                15000000
        );
        System.out.println("\n===== STUDENT =====");
        System.out.println(s1);
        s1.setAddress("Ha Noi");
        s1.setProgram("Game Technology");
        s1.setYear(2);
        s1.setFee(18000000);
        System.out.println("\n===== STUDENT AFTER UPDATE =====");
        System.out.println("Name: " + s1.getName());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Program: " + s1.getProgram());
        System.out.println("Year: " + s1.getYear());
        System.out.println("Fee: " + s1.getFee());
        Staff st1 = new Staff(
                "Nguyen Van An",
                "Da Nang",
                "VKU",
                12000000
        );
        System.out.println("\n===== STAFF =====");
        System.out.println(st1);
        st1.setAddress("Ho Chi Minh");
        st1.setSchool("University");
        st1.setPay(15000000);
        System.out.println("\n===== STAFF AFTER UPDATE =====");
        System.out.println("Name: " + st1.getName());
        System.out.println("Address: " + st1.getAddress());
        System.out.println("School: " + st1.getSchool());
        System.out.println("Pay: " + st1.getPay());
    }
}