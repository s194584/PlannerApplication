package planner.app;

import java.util.List;

public class Project {
    private static int projectIDgen = 0;
    private int projectID;
    private Information information;
    private List<Activity> Activities;

    public Project() {
        projectID = projectIDgen++;
    }
}
