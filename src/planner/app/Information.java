package planner.app;

import java.time.LocalDate;

public class Information {

    private String description;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Information(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        setEndDate(endDate);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) throws IllegalArgumentException {
        if (endDate != null && startDate != null) {
            if (!startDate.isBefore(endDate)) {
                throw new IllegalArgumentException("End date must be after start date");
            } else {
                this.endDate = endDate;
            }
        }
    }
}
