package planner.app;

import java.util.ArrayList;
import java.util.List;

public class PlannerApplication {
    private User admin = new Admin("000");
    private List<User> users = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public PlannerApplication(){
        users.add(admin);
    }

    public boolean login(String arg0) {
        for (User u:users) {
            if(u.getInitials().equals(arg0)){
                u.login(true);
                return true;
            }
        }
        return false;
    }

    public User getAdmin() {
        return admin;
    }

    public User getUser(String in){
        for (User u:users) {
            if(u.getInitials().equals(in)){
                return u;
            }
        }
        return null;
    }

    public List<User> getUsers(){
        return users;
    }

    public void addUser(User user) throws Exception {
        if (user.getInitials().length() != 3)
            throw new Exception("User must have 3 initials");

        if (hasUser(user)) {
            throw new Exception("User already exists");
        }
        users.add(user);
    }

    public boolean hasUser(String initials) {
        return users.stream().anyMatch(user -> user.getInitials().equals(initials));
    }

    public boolean hasUser(User user) {
        return users.stream().anyMatch(u -> u.getInitials().equals(user.getInitials()));
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
}
