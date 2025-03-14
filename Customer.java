package Inheritance;

public class Customer {
    private int cid;
    private String cname;
    protected int balance;
    static double rate = 8.5;
    static int time = 5;
    private static String bank = "American Express";

    public Customer(int cid, String cname, int balance) {
        this.cid = cid;
        this.cname = cname;
        this.balance = balance;
    }

    public void dispCustomer() {
        System.out.println(cid + " " + cname + " " + balance + " " + bank);
    }

    public void calSimp() {
        double SimpleInterest = balance * (1 + ((rate / 100) * time));
        System.out.println("Simple interest is: " + SimpleInterest);
    }
}
