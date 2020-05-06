package planner.app;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PlannerApplication {
    private User admin = new Admin("000");
    private User currentUser;
    private List<User> users = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<Activity> activities = new ArrayList<>();

    public PlannerApplication(){
        users.add(admin);
    }

    public int getNumberOfActivities() {
        return activities.size();
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean login(String initials) {
        for (User u : users) {
            if (u.getInitials().equals(initials)) {
                u.setLoginStatus(true);
                setCurrentUser(u);
                return true;
            }
        }
        return false;
    }

    public boolean logout(String initials) {
        for (User u : users) {
            if (u.getInitials().equals(initials) && u.getLoginStatus()) {
                u.setLoginStatus(false);
                setCurrentUser(null);
                return true;
            }
        }
        return false;
    }

    public User getAdmin() {
        return admin;
    }

    public User getUser(String initials) throws NoSuchElementException {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getInitials().equals(initials))
                return user;
        }
        throw new NoSuchElementException("User does not exist");
    }

    public List<User> getUsers(){
        return users;
    }

    public void addUser(User user) throws Exception {
//        assert users != null && user.getInitials().length() <= 4 && user.getInitials().length() > 0 && !hasUser(user): "Length of " + "initials is not allowed";
        if (user.getInitials().length() < 1 || user.getInitials().length() > 4)
            throw new Exception("User must have at least 1 initial and maximum 4");

        if (hasUser(user)) {
            throw new Exception("User already exists");
        }
        users.add(user);
//        assert hasUser(user);
    }

    public boolean hasUser(String initials) {
        try {
            getUser(initials);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean hasUser(User user) {
        return hasUser(user.getInitials());
    }

    public void removeUser(User user) throws Exception {
        if (user.getInitials().equals(admin.getInitials()))
            throw new Exception("Admin cannot remove admin");

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getInitials().equals(user.getInitials())) {
                users.remove(i);
                return;
            }
        }
        throw new Exception("User does not exist");
    }

    public void addProject(Project project) throws Exception {
        if (admin.getLoginStatus())
            projects.add(project);
        else
            throw new Exception("Not authorized to add/remove project");
    }

    public boolean hasProject(Project project) {
        try {
            getProject(project.getProjectID());
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void removeProject(Project project) throws Exception {
        removeProject(project.getProjectID());
    }

    public void removeProject(int id) throws Exception {
        if (!admin.getLoginStatus())
            throw new IllegalAccessException("Not authorized to add/remove project");

        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getProjectID() == id) {
                projects.remove(i);
                return;
            }
        }
        throw new NoSuchElementException("Project does not exist");
    }

    public void assignProjManToProject(String initials, int projectID) throws NoSuchElementException {
        User u = getUser(initials);
        removeUser(u);
        u = new ProjectManager(u);
        addUser(u);
        Project project = getProject(projectID);
        project.setProjectManager((ProjectManager) u);

    }

    public Project getProject(int projectID) throws NoSuchElementException {
        for (int i = 0; i < projects.size(); i++) {
            Project p = projects.get(i);
            if (p.getProjectID() == projectID)
                return p;
        }
        throw new NoSuchElementException("Project does not exist");
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addActivity(Activity activity) throws IllegalAccessException {
        if (currentUser instanceof ProjectManager) {
            activities.add(activity);
        } else
            throw new IllegalAccessException("Not authorized to add/remove activity");
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

    public boolean hasActivity(Activity activity) {
        try {
            getActivity(activity.getID());
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void addActivityToProject(int activityID, int projectID) throws NoSuchElementException {
        Project project = getProject(projectID);
        Activity activity = getActivity(activityID);
        project.addActivity(activity);
    }
}
