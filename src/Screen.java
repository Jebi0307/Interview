import java.util.List;

public class Screen {

    int screenNumber;
    List<TimeSlot> availableSlots;

    public Screen(List<TimeSlot> availableSlots, int screenNumber) {
        this.availableSlots = availableSlots;
        this.screenNumber = screenNumber;
    }
}
