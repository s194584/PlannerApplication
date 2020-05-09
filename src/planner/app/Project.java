package planner.app;

import java.util.*;

public class Project implements Workable{
    private static int projectIDgen = 0;

    private int projectID;
    private ProjectManager projectManager;

    // Info about the project's name, description, start and end dates
    private Information information;

    // Table of activities
    private HashMap<Integer, Activity> activities = new HashMap<>();

    public Project() {
        this("");
    }

    public Project(String projectName) {
        this(projectName, new ProjectManager("N/A"));
    }

    public Project(Information info) {
        this(info, null);
    }

    public Project(String projectName, ProjectManager projectManager) {
        this(new Information(projectName, "" ,null, null), projectManager);
    }

    public Project(Information info, ProjectManager projectManager) {
        projectID = Integer.parseInt("" + Calendar.getInstance().get(Calendar.YEAR) + projectIDgen++);
        this.projectManager = projectManager;
        information = info;
    }


    public int getProjectID() {
        return projectID;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public boolean hasProjectManager() {
        return !projectManager.getInitials().equals("N/A"); // Don't do this
    }

    public Information getInformation() {
        return information;
    }

    public int getNumberOfActivities() {
        return activities.size();
    }

    public void addActivity(Activity activity) {
        activities.put(activity.getID(), activity);
    }

    // Returns activity or throws an exception if it doesn't exist
    public Activity getActivity(int activityID) throws NoSuchElementException {
        Activity activity = activities.get(activityID);
        if (activity == null)
            throw new NoSuchElementException("Activity does not exist");
        return activity;
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
        Activity activity = activities.remove(id);
        if (activity == null)
            throw new NoSuchElementException("Activity does not exist");
    }

    @Override
    public String toString() {
        return information.getName();
    }

    public HashMap<Integer, Activity> getActivities() {
        return activities;
    }
}