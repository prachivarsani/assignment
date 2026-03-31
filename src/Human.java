// Base abstract class
public abstract class Human {
    private String fullName;
    private int years;

    public Human(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }

    // ===== GETTERS =====
    public String getFullName() {
        return fullName;
    }

    public int getYears() {
        return years;
    }

    // ===== ABSTRACT METHOD =====
    public abstract void showInfo();
}