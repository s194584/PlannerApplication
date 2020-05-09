package acceptance_tests;

import org.junit.Test;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.ProjectManager;
import planner.app.User;

import static org.junit.Assert.assertTrue;

public class WhiteBoxTestAddUser {

    PlannerApplication plannerApplication = new PlannerApplication();
    Employee zeroInitialsEmployee = new Employee("");
    Employee fiveInitialsEmployee = new Employee("ABCDE");
    Employee validEmployee = new Employee("ABC");
    Employee validEmployee2 = new Employee("DEF");
    ProjectManager projectManager = new ProjectManager("PM");
    User admin = plannerApplication.getAdmin();

    @Test(expected = Exception.class)
    public void testInputDataSetA() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(zeroInitialsEmployee);
    }

    @Test(expected = Exception.class)
    public void testInputDataSetB() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(fiveInitialsEmployee);
    }

    @Test(expected = Exception.class)
    public void testInputDataSetC() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(validEmployee);
        plannerApplication.addUser(validEmployee);
    }

    @Test(expected = Exception.class)
    public void testInputDataSetDWithEmployee() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(validEmployee);
        plannerApplication.addUser(validEmployee2);
        plannerApplication.logout(admin.getInitials());
        plannerApplication.login(validEmployee.getInitials());
        plannerApplication.addUser(validEmployee2);
    }

    @Test(expected = Exception.class)
    public void testInputDataSetDWithProjectManager() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(projectManager);
        plannerApplication.logout(admin.getInitials());
        plannerApplication.login(projectManager.getInitials());
        plannerApplication.addUser(validEmployee);
    }

    @Test
    public void testInputDataSetE() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(validEmployee);
        assertTrue(plannerApplication.hasUser(validEmployee));
    }
}
