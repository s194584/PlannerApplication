package planner.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee extends User {

    private HashMap<Integer, Activity> activitiesAssignedTo = new HashMap<>();
    private HashMap<Integer, Double> registeredTimeOnActivities = new HashMap<>();
    private double registeredTimeInSession = 0;

    public Employee(String initials) {
        super(initials);
    }

    @Override
    public void setLoginStatus(boolean b) {
        super.setLoginStatus(b);
        registeredTimeInSession = 0;
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
        Activity activity = activitiesAssignedTo.get(activityID);
        activity.addRegisteredTime(time);
        registeredTimeInSession += time;
    }

    public double getRegisteredTime(int activityID) {
        return registeredTimeOnActivities.get(activityID);
    }

    public double getRegisteredTimeInSession() {
        return registeredTimeInSession;
    }
}