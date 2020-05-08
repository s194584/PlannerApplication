package planner.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Employee extends User {

    private HashMap<Integer, Activity> activitiesAssignedTo = new HashMap<>();

    public Employee(String initials) {
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

    public boolean isAvailable(LocalDate start, LocalDate end){
        List<Activity> activities = getActivities();
        List<Activity> temp = activities.stream().filter(a -> a instanceof AbsenceActivity).collect(Collectors.toList());
        if(temp.size()!=0){
            return !temp.stream().anyMatch(a -> end.isBefore(a.getInformation().getStartDate())||
                    start.isAfter( a.getInformation().getEndDate()));
        }
        return false;
    }

    public List<Activity> getActivities(){
        return new ArrayList<>(activitiesAssignedTo.values());
    }
}