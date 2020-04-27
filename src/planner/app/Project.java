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
        this.projectName = projectName;
        this.projectManager = projectManager;
    }

    public int getID() {
        return projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
}
