package planner.app;

import java.util.ArrayList;
import java.util.List;

public class PlannerApplication {
    private User admin = new Admin("000");
    private List<User> users = new ArrayList<>();

    public PlannerApplication(){
        users.add(admin);
    }

//    public void login(String arg0) {
//        for (User u:users) {
//            if(u.getInitials().equals(arg0)){
//                u.login(true);
//            }
//        }
//    }
//
    public User getAdmin() {
        return admin;
    }

    public List<User> getUsers(){
        return users;
    }
}
