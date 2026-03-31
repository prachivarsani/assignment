// Concrete class 2
public class Specialist extends Employee {
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
        System.out.println("Age: " + getYears());
        System.out.println("Department: " + field);
    }

    // ===== GETTERS (REQUIRED FOR FILE HANDLING) =====
    public String getField() {
        return field;
    }

    public double getBasicPay() {
        return basicPay;
    }
}