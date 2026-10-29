public class Book {
    String name;
    Author[] authors ;
    double price;
    int qty;
    public Book(String name, Author[] authors,
                double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        String authorsStr = "";
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorsStr += ",";
            }

            authorsStr += authors[i].toString();
        }
        return "Book[name=" + name
                + ",authors={" + authorsStr + "}"
                + ",price=" + price
                + ",qty=" + qty + "]";
    }
}
