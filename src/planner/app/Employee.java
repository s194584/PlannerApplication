package planner.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee extends User {

    private HashMap<Integer, Activity> activitiesAssignedTo = new HashMap<>();
    private HashMap<Integer, Double> registeredTimeOnActivities = new HashMap<>();

    public Employee(String initials) {
        super(initials);
    }

    public void assignActivity(Activity activity) {
        activitiesAssignedTo.put(activity.getID(), activity);
        registeredTimeOnActivities.put(activity.getID(), 0.0);
    }

    public boolean isAssignedToActivity(Activity activity) {
        return isAssignedToActivity(activity.getID());
    }

    public boolean isAssignedToActivity(int id) {
        return activitiesAssignedTo.containsKey(id);
    }

    public List<Activity> getActivities(){
        return new ArrayList<>(activitiesAssignedTo.values());
    }

    public void registerTime(int activityID, double time) {

        double oldTime = registeredTimeOnActivities.get(activityID);
        if (oldTime + time < 0)
            throw new IllegalArgumentException("Registered time cannot be negative");

        registeredTimeOnActivities.put(activityID, oldTime + time);
    }

    public double getRegisteredTime(int activityID) {
        return registeredTimeOnActivities.get(activityID);
    }
}