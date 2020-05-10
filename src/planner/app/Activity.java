package planner.app;

import java.time.LocalDate;

public class Activity implements Workable {

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int id;
    private double totalTimeRegistered = 0;

    public Activity() {
        this(new Information("", "", LocalDate.now(), LocalDate.now().plusDays(1)), 0);
    }

    public void addRegisteredTime(double time) {
        totalTimeRegistered += time;
    }

    public double getTotalTimeRegistered() {
        return totalTimeRegistered;
    }

    public Activity(Information information, double estimatedTimeUsage) {
        id = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getID() {
        return id;
    }

    public Information getInformation() {
        return information;
    }

    public void setEstimatedTimeUsage(double timeUsage) {
        if(timeUsage<0){
            estimatedTimeUsage = 0;
        }else {
            estimatedTimeUsage = Utility.roundDoubleToHalf(timeUsage);
        }
    }

    public double getEstimatedTimeUsage() {
        return estimatedTimeUsage;
    }

}
