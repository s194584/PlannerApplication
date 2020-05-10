package planner.app;

public abstract class User {
    private String initials;
    private boolean loginStatus = false;

    public User(String in){
        initials = in;
    }

    public String getInitials() {
        return initials;
    }

    public void setLoginStatus(boolean b) {
        loginStatus = b;
    }

    public boolean getLoginStatus(){
        return loginStatus;
    }

    // Used by GUI
    @Override
    public String toString() {
        return initials;
    }
}
