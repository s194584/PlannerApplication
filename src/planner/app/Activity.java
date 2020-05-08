package planner.app;

import java.time.LocalDate;

public class Activity implements Workable{

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int id;

    public Activity() {
        this(new Information("", "", LocalDate.now(), LocalDate.now()), 0);
    }

    public Activity(Information information, double estimatedTimeUsage) {
        id = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getId() {
        return id;
    }

    public Information getInformation() {
        return information;
    }

    public void setEstimatedTimeUsage(double timeUsage) {
        estimatedTimeUsage = timeUsage;
    }

    public double getEstimatedTimeUsage() {
        return estimatedTimeUsage;
    }

}
