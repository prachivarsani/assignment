// Concrete class 3
public class Payment implements Payable {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    @Override
    public void printReceipt() {
        System.out.println("Payment Due: " + amount);
    }
}