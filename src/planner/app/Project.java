package planner.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Project {
    private static int projectIDgen = 0;

    private int projectID;
    private ProjectManager projectManager;
    private Information information;
    private List<Activity> activities = new ArrayList<Activity>();

    public Project() {
        this("");
    }

    public Project(String projectName) {
        this(projectName, new ProjectManager("N/A"));
    }

    public Project(String projectName, ProjectManager projectManager) {
        projectID = Integer.parseInt("" + Calendar.getInstance().get(Calendar.YEAR) + projectIDgen++);
        this.projectManager = projectManager;
        information = new Information(projectName, "","","");
    }

    public Project(Information info) {
        information = info;
    }

    public int getProjectID() {
        return projectID;
    }

    public String getProjectName() {
        return information.getName();
    }

    public void setProjectName(String projectName) {
        information.setName(projectName);
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public boolean hasProjectManager() {
        return !projectManager.getInitials().equals("N/A");
    }

    public Information getInformation() {
        return information;
    }

    public int numOfActivities() {
        return activities.size();
    }

    public void setInformation(Information information) {
        this.information = information;
    }
    public void setDescription(String description) {
        information.setDescription(description);
    }

    public void setStartDate(String startDate) {
        information.setStartDate(startDate);
    }

    public void setEndDate(String endDate) {
        information.setEndDate(endDate);
    }
}