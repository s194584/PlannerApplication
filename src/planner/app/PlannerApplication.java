package planner.app;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlannerApplication {
    private User admin = new Admin("000");
    private User currentUser;
    private HashMap<String, User> users = new HashMap<>();
    private HashMap<Integer, Project> projects = new HashMap<>();
    private HashMap<Integer, Activity> activities = new HashMap<>();

    public PlannerApplication() {

        users.put(admin.getInitials(), admin);

        // TESTING STANDARD
        users.put("a", new Employee("a"));

        Project someProject = new Project("Woogle");
        projects.put(someProject.getProjectID(), someProject);
        login("000");
        try {
            assignProjManToProject("a",20201);
            login("a");
            addActivity(new Activity());
            addActivity(new Activity());
            addActivity(new Activity());
            addActivityToProject(0,20201);
            addActivityToProject(1,20201);
            addActivityToProject(2,20201);
            logout("a");
        } catch (Exception ignored) {

        }
        logout("000");
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
        User u = users.get(initials);
        if (u == null)
            return false;
        u.setLoginStatus(true);
        setCurrentUser(u);
        return true;
    }

    public boolean logout(String initials) {
        User u = users.get(initials);
        if (u == null || !u.getLoginStatus())
            return false;
        u.setLoginStatus(false);
        setCurrentUser(null);
        return true;
    }

    public User getAdmin() {
        return admin;
    }

    public User getUser(String initials) throws NoSuchElementException {
        User u = users.get(initials);
        if (u == null)
            throw new NoSuchElementException("User does not exist");
        return u;
    }

    public ArrayList<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    public void addUser(User user) throws Exception {
//        assert users != null && user.getInitials().length() <= 4 && user.getInitials().length() > 0 && !hasUser(user): "Length of " + "initials is not allowed";
        if (!isValidInitials(user.getInitials()))
            throw new IllegalArgumentException("User must have at least 1 initial and maximum 4");

        if (hasUser(user)) {
            throw new AlreadyExistsException("User already exists");
        }
        if (!(currentUser instanceof Admin))
            throw new OperationNotSupportedException("Only admin can add user");

        // Add user if everything is OK
        users.put(user.getInitials(), user);
//        assert hasUser(user);
    }

    private boolean isValidInitials(String initials) {
        return initials.length() >= 1 && initials.length() <= 4;
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
            throw new OperationNotSupportedException("Admin cannot remove admin");

        User removedUser = users.remove(user.getInitials());

        if (removedUser == null)
            throw new NoSuchElementException("User does not exist");
    }

    public void addProject(Project project) throws Exception {
        if (admin.getLoginStatus())
            projects.put(project.getProjectID(), project);
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

        Project project = projects.remove(id);
        if (project == null)
            throw new NoSuchElementException("Project does not exist");
    }

    public void assignProjManToProject(String initials, int projectID) throws Exception {
        User u = getUser(initials);

        if (!(u instanceof ProjectManager)) {
            // Re-insert user as project manager
            removeUser(u);
            u = new ProjectManager(u);
            addUser(u);
        }
        Project project = getProject(projectID);
        project.setProjectManager((ProjectManager) u);

    }

    public Project getProject(int projectID) throws NoSuchElementException {
        Project project = projects.get(projectID);
        if (project == null)
            throw new NoSuchElementException("Project does not exist");
        return project;
    }

    public ArrayList<Project> getProjects() {
        return new ArrayList<>(projects.values());
    }

    public void addActivity(Activity activity) throws IllegalAccessException {
        if (currentUser instanceof ProjectManager) {
            activities.put(activity.getID(), activity);
        } else
            throw new IllegalAccessException("Not authorized to add/remove activity");
    }

    public Activity getActivity(int activityID) throws NoSuchElementException {
        Activity activity = activities.get(activityID);
        if (activity == null)
            throw new NoSuchElementException("Activity does not exist");
        return activity;
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

    public void removeActivity(int id) {
        Activity activity = activities.remove(id);
        if (activity == null)
            throw new NoSuchElementException("Activity does not exist");
    }

    public ArrayList<Employee> getEmployeesAssignedToActivity(Activity a) {
        ArrayList<Employee> temp = (ArrayList<Employee>) users.values().stream()
                .filter(u -> u instanceof Employee)
                .map(u -> (Employee) u)
                .filter(e -> e.isAssignedToActivity(a))
                .collect(Collectors.toList());
        return temp;
    }
}
