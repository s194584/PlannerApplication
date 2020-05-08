package planner.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Activity implements Workable{

    private static int activityIDgen = 0;

    private Information information;
    private double estimatedTimeUsage;
    private int id;
    private List<Employee> assignedEmployees = new ArrayList<>();

    public Activity() {
        this(new Information("", "", LocalDate.now(), LocalDate.now()), 0);
    }

    public Activity(Information information, double estimatedTimeUsage) {
        id = activityIDgen++;
        this.information = information;
        this.estimatedTimeUsage = estimatedTimeUsage;
    }

    public int getId() {
        return id;
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
        return assignedEmployees.stream().allMatch(e -> e.getInitials().equals(initials));
    }
}
