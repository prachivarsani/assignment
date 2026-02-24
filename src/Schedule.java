// Concrete class 4
public class Schedule implements Reservable {

    @Override
    public void reserveSlot() {
        System.out.println("Slot reserved successfully.");
    }
}