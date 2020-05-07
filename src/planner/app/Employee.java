package planner.app;

import java.util.List;

public class Employee extends User {
    private int noOfActivities=0;

    public Employee (String in){
        super(in);
    }

    public void incrementNoOfActivities(){
        this.noOfActivities++;
    }

    public int getNoOfActivities(){
        return noOfActivities;
    }

}


