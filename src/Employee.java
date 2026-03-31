// Second abstract class
public abstract class Employee extends Human {
    protected double basicPay;

    public Employee(String fullName, int years, double basicPay) {
        super(fullName, years);
        this.basicPay = basicPay;
    }

    public abstract void computePay();
}