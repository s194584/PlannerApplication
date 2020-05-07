package planner.app;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;

public class Project {
    private static int projectIDgen = 0;

    private int projectID;
    private ProjectManager projectManager;
    private Information information;
    private List<Activity> activities = new ArrayList<>();

    public Project() {
        this("");
    }

    public Project(String projectName) {
        this(projectName, new ProjectManager("N/A"));
    }

    public Project(String projectName, ProjectManager projectManager) {
        projectID = Integer.parseInt("" + Calendar.getInstance().get(Calendar.YEAR) + projectIDgen++);
        this.projectManager = projectManager;
        information = new Information(projectName, "",null,null);
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

    public int getNumberOfActivities() {
        return activities.size();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public Activity getActivity(int activityID) throws NoSuchElementException {
        for (int i = 0; i < activities.size(); i++) {
            Activity a = activities.get(i);
            if (a.getID() == activityID) {
                return a;
            }
        }
        throw new NoSuchElementException("Activity does not exist");
    }

    public boolean hasActivity(int activityID) {
        try {
            getActivity(activityID);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void removeActivity(int id) throws NoSuchElementException {
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).getID() == id) {
                activities.remove(i);
                return;
            }
        }
        throw new NoSuchElementException("Activity does not exist");
    }

    @Override
    public String toString() {
        return information.getName();
    }

    public List<Activity> getActivities() {
        return activities;
    }
}