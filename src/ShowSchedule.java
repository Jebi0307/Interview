import java.time.LocalTime;

public class ShowSchedule {

    int screenNumber;
    String movieName;
    LocalTime startTime;
    LocalTime endTime;

    public ShowSchedule(int screenNumber, String movieName, LocalTime startTime, LocalTime endTime) {
        this.screenNumber = screenNumber;
        this.movieName = movieName;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
