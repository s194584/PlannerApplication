package planner.app;

import java.util.HashMap;

public class Employee extends User {

    private HashMap<Integer, Activity> activitiesAssignedTo = new HashMap<>();

    public Employee (String initials){
        super(initials);
    }

    public void assignActivity(Activity activity) {
        activitiesAssignedTo.put(activity.getID(), activity);
    }

    public boolean isAssignedToActivity(Activity activity) {
        return isAssignedToActivity(activity.getID());
    }

    public boolean isAssignedToActivity(int id) {
        return activitiesAssignedTo.containsKey(id);
    }
