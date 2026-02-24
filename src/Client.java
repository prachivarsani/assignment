// Concrete class 1
public class Client extends Human {
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