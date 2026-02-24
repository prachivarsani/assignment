// Base abstract class
abstract class Human {
    private String fullName;
    private int years;

    public Human(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYears() {
        return years;
    }

    public abstract void showInfo();
}

// Second abstract class
abstract class Employee extends Human {
    protected double basicPay;

    public Employee(String fullName, int years, double basicPay) {
        super(fullName, years);
        this.basicPay = basicPay;
    }

    public abstract void computePay();
}

// Concrete class 1
class Client extends Human {
    private String illnessType;

    public Client(String fullName, int years, String illnessType) {
        super(fullName, years);
        this.illnessType = illnessType;
    }

    @Override
    public void showInfo() {
        System.out.println("Client Name: " + getFullName());
        System.out.println("Condition: " + illnessType);
    }
}

// Concrete class 2
class Specialist extends Employee {
    private String field;

    public Specialist(String fullName, int years, double basicPay, String field) {
        super(fullName, years, basicPay);
        this.field = field;
    }

    @Override
    public void computePay() {
        System.out.println("Monthly Pay: " + basicPay);
    }

    @Override
    public void showInfo() {
        System.out.println("Doctor: " + getFullName());
        System.out.println("Department: " + field);
    }
}

// Interface 1
interface Payable {
    void printReceipt();
}

// Concrete class 3
class Payment implements Payable {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    @Override
    public void printReceipt() {
        System.out.println("Payment Due: " + amount);
    }
}

// Interface 2
interface Reservable {
    void reserveSlot();
}

// Concrete class 4
class Schedule implements Reservable {

    @Override
    public void reserveSlot() {
        System.out.println("Slot reserved successfully.");
    }
}

// Main class
public class HospitalSystemApp {
    public static void main(String[] args) {

        Client c1 = new Client("prachi", 22, "Flu");
        Specialist s1 = new Specialist("Varsani", 45, 90000, "Neurology");
        Payment pay1 = new Payment(750);
        Schedule sc1 = new Schedule();

        c1.showInfo();
        System.out.println("----------------");
        s1.showInfo();
        s1.computePay();
        System.out.println("----------------");
        pay1.printReceipt();
        sc1.reserveSlot();
    }
}