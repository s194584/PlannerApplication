package planner.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// Ansvarlig: Christopher
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
        LocalDate startDate = activity.getInformation().getStartDate();
        LocalDate endDate = activity.getInformation().getStartDate();

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
        time = Utility.roundDoubleToHalf(time);

        assert activitiesAssignedTo.get(activityID) != null &&
                registeredTimeOnActivities.get(activityID) + time >= 0 : "Precondition for registerTime";

        Activity activity = activitiesAssignedTo.get(activityID);
        double oldTime = registeredTimeOnActivities.get(activityID);

        // Class used for assertion
        class OldState{
            double oldActivityTime;
            double oldRegisteredTimeOnActivities;
            double oldRegisteredTimeInSession;
            OldState(){
                oldActivityTime = activity.getTotalTimeRegistered();
                oldRegisteredTimeOnActivities = oldTime;
                oldRegisteredTimeInSession = registeredTimeInSession;
            }
            public double getOldActivityTime() {return oldActivityTime;}
            public double getOldRegisteredTimeInSession() {return oldRegisteredTimeInSession;}
            public double getOldRegisteredTimeOnActivities() {return oldRegisteredTimeOnActivities;}
        }

        // Making sure that the class is not instantiated when assertion is disabled
        OldState oldState = null;
        assert (oldState = new OldState()) != null;

        if (oldTime + time < 0)
            throw new IllegalArgumentException("Registered time cannot be negative");

        registeredTimeOnActivities.put(activityID, oldTime + time); // Increment the 'old' registered time

        // Also add the registered time to the activity
        activity.addRegisteredTime(time);

        registeredTimeInSession += time;

        assert oldState.getOldActivityTime() == activity.getTotalTimeRegistered() - time &&
                oldState.getOldRegisteredTimeOnActivities() == registeredTimeOnActivities.get(activityID) - time &&
                oldState.getOldRegisteredTimeInSession() == registeredTimeInSession - time;
    }

    public double getRegisteredTime(int activityID) {
        return registeredTimeOnActivities.get(activityID);
    }

    public double getRegisteredTimeInSession() {
        return registeredTimeInSession;
    }
}