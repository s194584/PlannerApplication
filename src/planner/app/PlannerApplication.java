package planner.app;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class PlannerApplication {
    // Special admin user with initials 000 -- there always exists an admin
    private User admin = new Admin("000");

    private User currentUser;

    // Table of users
    private HashMap<String, User> users = new HashMap<>();

    // Table of projects
    private HashMap<Integer, Project> projects = new HashMap<>();

    // Table of activities in planner (these might also be in projects)
    private HashMap<Integer, Activity> activities = new HashMap<>();

    public PlannerApplication() {

        // Make sure there's always an admin
        users.put(admin.getInitials(), admin);

        // Default settings for GUI testing
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

    // Logs an user in and reports if login was successful
    public boolean login(String initials) {
        User u = users.get(initials);
        if (u == null)
            return false;
        u.setLoginStatus(true);
        setCurrentUser(u);
        return true;
    }

    // Logs an user out and reports if logout was successful
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

    // Return user or throw exception if user doesn't exist
    public User getUser(String initials) throws NoSuchElementException {
        User u = users.get(initials);
        if (u == null)
            throw new NoSuchElementException("User does not exist");
        return u;
    }

    public ArrayList<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    // Add user to planner. Only admin can do this.
    // Length of initials must be between 1 and 4 inclusive.
    // User will not be added if it already exists in planner.
    public void addUser(User user) throws Exception {
//        assert users != null && user.getInitials().length() <= 4 && user.getInitials().length() > 0 && !hasUser(user): "Length of " + "initials is not allowed";
        if (!(currentUser instanceof Admin))
            throw new OperationNotSupportedException("Only admin can add user");

        if (!isValidInitials(user.getInitials())) {
            throw new IllegalArgumentException("User must have at least 1 initial and maximum 4");
        }

        if (hasUser(user)) {
            throw new AlreadyExistsException("User already exists");
        }

        // At this point everything is OK, so add the user.
        users.put(user.getInitials(), user);
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

        // We don't want to be able to remove the only admin.
        if (isUserAdmin(user))
            throw new OperationNotSupportedException("Admin cannot remove admin");

        User removedUser = users.remove(user.getInitials());

        if (removedUser == null)
            throw new NoSuchElementException("User does not exist");
    }


    public void addProject(Project project) throws Exception {
        if (isAdminLoggedIn())
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

    // Remove a project.
    // Throws exception if user is not authorized or project doesn't exist.
    public void removeProject(int projectID) throws Exception {
        if (!isAdminLoggedIn())
            throw new IllegalAccessException("Not authorized to add/remove project");

        Project project = projects.remove(projectID);
        if (project == null)
            throw new NoSuchElementException("Project does not exist");
    }

    // Assign a user as project manager to a project.
    // If the user is not a project manager, it will be upgraded to one.
    public void assignProjManToProject(String initials, int projectID) throws Exception {
        User user = getUser(initials);

        if (!(user instanceof ProjectManager)) {
            user = upgradeToProjectManager(user);
        }

        Project project = getProject(projectID);
        project.setProjectManager((ProjectManager) user);

    }

    // Upgrades user to project manager by removing user and re-inserts it as project manager
    private ProjectManager upgradeToProjectManager(User u) throws Exception {
        removeUser(u);
        ProjectManager pm = new ProjectManager(u);
        addUser(pm);
        return pm;
    }

    // Returns project or throws an exception if it doesn't exist
    public Project getProject(int projectID) throws NoSuchElementException {
        Project project = projects.get(projectID);
        if (project == null)
            throw new NoSuchElementException("Project does not exist");
        return project;
    }

    public ArrayList<Project> getProjects() {
        return new ArrayList<>(projects.values());
    }

    // Adds activity to planner if current user is authorized (is a project manager)
    public void addActivity(Activity activity) throws IllegalAccessException {
        if (currentUser instanceof ProjectManager) {
            activities.put(activity.getID(), activity);
        } else
            throw new IllegalAccessException("Not authorized to add/remove activity");
    }

    // Returns activity or throws an exception if it doesn't exist
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

    // Add activity to project if they both exist
    public void addActivityToProject(int activityID, int projectID) throws NoSuchElementException {
        Project project = getProject(projectID);
        Activity activity = getActivity(activityID);
        project.addActivity(activity);
    }

    public void removeActivity(int activityID) {
        Activity activity = activities.remove(activityID);
        if (activity == null)
            throw new NoSuchElementException("Activity does not exist");
    }

    // Returns list of employees which are assigned to the given activity
    public ArrayList<Employee> getEmployeesAssignedToActivity(Activity a) {
        return (ArrayList<Employee>) users.values().stream() // Create stream
                .filter(u -> u instanceof Employee) // Keep employees only
                .map(u -> (Employee) u) // cast User to Employee
                .filter(e -> e.isAssignedToActivity(a)) // Keep employees who are assigned to the given activity
                .collect(Collectors.toList()); // Collect the results in a list
    }

    private boolean isValidInitials(String initials) {
        return initials.length() >= 1 && initials.length() <= 4;
    }

    private boolean isUserAdmin(User user) {
        return user.getInitials().equals(admin.getInitials());
    }

    private boolean isAdminLoggedIn() {
        return admin.getLoginStatus();
    }
}
