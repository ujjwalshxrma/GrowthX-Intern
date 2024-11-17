package assignmentPortal.example.GrowthX.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
public class DateTime {

    private LocalDate date;
    private LocalTime time;

    public DateTime(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return date.toString() + " " + time.toString();
    }
}
