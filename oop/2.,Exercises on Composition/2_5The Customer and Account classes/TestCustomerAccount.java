public class TestCustomerAccount {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Linh", 'm');
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
        System.out.println(c1.toString());
        Account a1 = new Account(5001, c1, 100.0);
        System.out.println(a1);
        a1.deposit(50.0);
        System.out.println("After deposit: " + a1);
        a1.withdraw(30.0);
        System.out.println("After withdraw: " + a1);
        System.out.println("Customer name: "
                + a1.getCustomerName());
    }
}
