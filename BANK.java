package Inheritance;

public class BANK {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer(101, "Tom", 1000000);
        ClassicCustomer classicCustomer = new ClassicCustomer(102, "Jerry", 1000000);

        System.out.println("Regular Customer Details:");
        regularCustomer.dispCustomer();
        regularCustomer.calSimp();

        System.out.println("\nClassic Customer Details:");
        classicCustomer.dispCustomer();
        classicCustomer.calSimp();
    }
}
