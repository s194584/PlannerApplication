package planner.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

// Ansvarlig: Andreas
// Utility class for transforming between LocalDate and String
public class DateMapper {

    public static LocalDate transformToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

    public static String transformToString(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public static int transformToWeekNumber(LocalDate date){
        TemporalField weekOfYear = WeekFields.of(Locale.getDefault()).weekOfYear();
        return date.get(weekOfYear);
    }
}
