package planner.app;

public abstract class User {

    private static int idgen = 0;
    private int userID;
    private String initials;
    private boolean loginStatus = false;

    public User(String in){
        initials = in;
        userID = idgen++;
    }

    public String getInitials() {
        return initials;
    }

    public void login(boolean b) {
        loginStatus = b;
    }

    public boolean getLoginStatus(){
        return loginStatus;
    }
}
