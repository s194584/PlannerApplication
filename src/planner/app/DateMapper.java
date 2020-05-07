package planner.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateMapper {

    public static LocalDate transformToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

    public static String transformToString(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

}
