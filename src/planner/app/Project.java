package planner.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Project {
    private static int projectIDgen = 0;

    private String projectName;
    private String projectID;
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
        projectID = "" + Calendar.getInstance().get(Calendar.YEAR) + projectIDgen++;
        this.projectName = projectName;
        this.projectManager = projectManager;
    }

    public int getProjectID() {
        return Integer.parseInt(projectID);
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

        return !projectManager.getInitials().equals("N/A");
    }

    public int getNoAct() {
        return activities.size();
    }
}
