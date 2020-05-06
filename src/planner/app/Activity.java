package planner.app;

public class Activity {

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int activityID;

    public Activity() {
        this(null, 0);
    }

    public Activity(Information information, double estimatedTimeUsage) {
        activityID = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getID() {
        return activityID;
    }
}
