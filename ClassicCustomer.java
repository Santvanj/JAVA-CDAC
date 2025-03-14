package Inheritance;


public class ClassicCustomer extends Customer {
    static double rate = 11.0;
    private final int withdrawalLimit = 1000000;

    public ClassicCustomer(int cid, String cname, int balance) {
        super(cid, cname, balance);
    }

    @Override
    public void dispCustomer() {
        super.dispCustomer();
        System.out.println("Savings Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }

    @Override
    public void calSimp() {
        double SimpleInterest = balance * (1 + ((rate / 100) * time));
        System.out.println("Simple interest for Classic Customer is: " + SimpleInterest);
    }
}