package planner.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    public boolean isAbsent(LocalDate selectedStart, LocalDate selectedEnd) {
        List<Activity> temp = getActivities().stream().filter(a -> a instanceof AbsenceActivity).collect(Collectors.
                toList());
        if (temp.size() != 0) {
            return temp.stream().anyMatch(a -> {
                LocalDate infoStart = a.getInformation().getStartDate();
                LocalDate infoEnd = a.getInformation().getEndDate();

                return (infoStart.isAfter(selectedStart) && infoStart.isBefore(selectedEnd)) ||
                        (infoEnd.isAfter(selectedStart) && infoEnd.isBefore(selectedEnd)) ||
                        (selectedStart.isAfter(infoStart) && selectedStart.isBefore(infoEnd));
            });
        }
        return false;
    }

    public List<Activity> getActivities(){
        return new ArrayList<>(activitiesAssignedTo.values());
    }

    // Register time on activity assigned to
    public void registerTime(int activityID, double time) {
        assert activitiesAssignedTo.get(activityID) != null &&
                registeredTimeOnActivities.get(activityID) + time >= 0 : "Precondition for registerTime";

        double oldTime = registeredTimeOnActivities.get(activityID);

        if (oldTime + time < 0)                                                       //1
            throw new IllegalArgumentException("Registered time cannot be negative");

        registeredTimeOnActivities.put(activityID, oldTime + time); // Increment the 'old' registered time

        // Also add the registered time to the activity
        Activity activity = activitiesAssignedTo.get(activityID);
        activity.addRegisteredTime(time);

        registeredTimeInSession += time;

        assert oldTime == registeredTimeOnActivities.get(activityID) - time;
    }

    public double getRegisteredTime(int activityID) {
        return registeredTimeOnActivities.get(activityID);
    }

    public double getRegisteredTimeInSession() {
        return registeredTimeInSession;
    }
}