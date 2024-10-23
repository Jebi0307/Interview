import java.time.LocalTime;

public class TimeSlot {

    LocalTime startTime;
    LocalTime endTime;

    public TimeSlot(LocalTime endTime, LocalTime startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }
}
