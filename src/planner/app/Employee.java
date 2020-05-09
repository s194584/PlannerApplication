package planner.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee extends User {

    // Activities employee is assigned to
    private HashMap<Integer, Activity> activitiesAssignedTo = new HashMap<>();

    // Table of employee's registered time on activities
    private HashMap<Integer, Double> registeredTimeOnActivities = new HashMap<>();

    // Total registered time in one login session - resets at logout
    private double registeredTimeInSession = 0;

    public Employee(String initials) {
        super(initials);
    }

    // Overriding User's setLoginStatus to reset total registered time at logout
    @Override
    public void setLoginStatus(boolean loginStatus) {
        super.setLoginStatus(loginStatus);
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

    // Register time on activity assigned to
    public void registerTime(int activityID, double time) {

        double oldTime = registeredTimeOnActivities.get(activityID);
        if (oldTime + time < 0)
            throw new IllegalArgumentException("Registered time cannot be negative");

        registeredTimeOnActivities.put(activityID, oldTime + time); // Increment the 'old' registered time

        // Also add the registered time to the activity
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