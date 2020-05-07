package planner.app;

import java.util.ArrayList;
import java.util.List;

public class Activity implements Workable{

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int activityID;
    private List<Employee> assignedEmployees = new ArrayList<>();

    public Activity() {
        this(new Information("", "", "", ""), 0);
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

    public String getName() {
        return information.getName();
    }

    public void setName(String name) {
        information.setName(name);
    }

    public String getDescription() {
        return information.getDescription();
    }

    public void setDescription(String description) {
        information.setDescription(description);
    }

    public String getStartDate() {
        return information.getStartDate();
    }

    public void setStartDate(String startDate) {
        information.setStartDate(startDate);
    }

    public String getEndDate() {
        return information.getEndDate();
    }

    public void setEndDate(String endDate) {
        information.setEndDate(endDate);
    }

    public void setEstimatedTimeUsage(double timeUsage) {
        estimatedTimeUsage = timeUsage;
    }

    public double getEstimatedTimeUsage() {
        return estimatedTimeUsage;
    }

    public void assignEmployee(Employee emp) {
        assignedEmployees.add(emp);
        emp.incrementNoOfActivities();
    }

    public boolean isEmployeeAssigned(String initials) {
        return assignedEmployees.stream().anyMatch(e -> e.getInitials().equals(initials));
    }
}
