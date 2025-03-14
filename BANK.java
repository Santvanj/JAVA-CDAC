package Inheritance;

public class BANK {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer(101, "Alice", 50000);
        ClassicCustomer classicCustomer = new ClassicCustomer(102, "Bob", 2000000);

        System.out.println("Regular Customer Details:");
        regularCustomer.dispCustomer();
        regularCustomer.calSimp();

        System.out.println("\nClassic Customer Details:");
        classicCustomer.dispCustomer();
        classicCustomer.calSimp();
    }
}