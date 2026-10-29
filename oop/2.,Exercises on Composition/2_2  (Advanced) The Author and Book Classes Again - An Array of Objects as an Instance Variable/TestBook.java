public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author(
                "Tan Ah Teck", "ahteck@gmail.com", 'm');
        authors[1] = new Author(
                "Paul Tan", "paul@gmail.com", 'm');
        Book b1 = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(b1);
        System.out.println("Ten sach: " + b1.getName());
        System.out.println("Gia sach: " + b1.getPrice());
        System.out.println("So luong: " + b1.getQty());
        for (Author a : b1.getAuthors()) {
            System.out.println(a.getName());
        }
    }
}