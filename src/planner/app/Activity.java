package planner.app;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Activity implements Workable{

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int activityID;
    private List<Employee> assignedEmployees = new ArrayList<>();

    public Activity() {
        this(new Information("", "", null, null), 0);
    }

    public Activity(Information information, double estimatedTimeUsage) {
        activityID = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getID() {
        return activityID;
    }

    public Information getInformation() {
        return information;
    }

    public void setEstimatedTimeUsage(double timeUsage) {
        estimatedTimeUsage = timeUsage;
    }

    public double getEstimatedTimeUsage() {
        return estimatedTimeUsage;
    }

    public List<Employee> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void assignEmployee(Employee emp) {
        if(!assignedEmployees.contains(emp)) {
            assignedEmployees.add(emp);
            emp.incrementNoOfActivities();
        }

    }

    public boolean isEmployeeAssigned(String initials) {
        return assignedEmployees.stream().anyMatch(e -> e.getInitials().equals(initials));
    }
}
