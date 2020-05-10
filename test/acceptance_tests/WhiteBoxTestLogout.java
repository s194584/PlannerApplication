package acceptance_tests;

import org.junit.Test;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.User;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// Ansvarlig: Christopher
public class WhiteBoxTestLogout {

    PlannerApplication plannerApplication = new PlannerApplication();
    User admin = plannerApplication.getAdmin();
    Employee employee = new Employee("ABC");

    @Test
    public void testInputDataSetA() throws Exception {
        assertFalse(plannerApplication.logout("DEF"));
    }

    @Test
    public void testInputDataSetB() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(employee);
        plannerApplication.logout(admin.getInitials());
        assertFalse(plannerApplication.logout(employee.getInitials()));
    }

    @Test
    public void testInputDataSetC() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(employee);
        plannerApplication.logout(admin.getInitials());
        plannerApplication.login(employee.getInitials());
        assertTrue(plannerApplication.logout(employee.getInitials()));
    }

}
