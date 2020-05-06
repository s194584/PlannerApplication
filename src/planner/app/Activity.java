package planner.app;

public class Activity {

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int activityID;


    public Activity() {
        this(new Information("","","",""), 0);
    }

    public Activity(Information information, double estimatedTimeUsage) {
        activityID = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getID() {
        return activityID;
    }


    public String getName(){
        return information.getName();
    }

    public String getDescription(){
        return information.getDescription();
    }
    public double getEstimatedTimeUsage() {
        return estimatedTimeUsage;
    }

    public void setEstimatedTimeUsage(double estimatedTimeUsage) {
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public Information getInformation() {
        return information;
    }
}
