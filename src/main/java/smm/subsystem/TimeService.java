package smm.subsystem;

public class TimeService {
    public String checkTime(String time) {
        if (time == null || time.isBlank()) {
            throw new IllegalArgumentException("Please enter a publishing time");
        }
        return time;
    }
}
