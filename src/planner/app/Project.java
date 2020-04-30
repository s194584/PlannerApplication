package planner.app;

import java.util.List;

public class Project {
    private static int projectIDgen = 0;

    private String projectName;
    private int projectID;
    private ProjectManager projectManager;
    private Information information;
    private List<Activity> Activities;

    public Project() {
        this("");
    }

    public Project(String projectName) {
        this(projectName, null);
    }

    public Project(String projectName, ProjectManager projectManager) {
        projectID = projectIDgen++;
        this.projectManager = projectManager;
        information = new Information(projectName, "","","");
    }

    public Project(Information info) {
        information = info;
    }

    public int getID() {
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
        return projectManager != null;
    }

    public Information getInformation() {
        return information;
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