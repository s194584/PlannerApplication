package acceptance_tests;

import org.junit.Test;
import planner.app.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// Ansvarlig: Malthe
public class WhiteBoxTestAssignProjManToProject {

    PlannerApplication plannerApplication = new PlannerApplication();
    User admin = plannerApplication.getAdmin();
    Employee employee = new Employee("HBL");
    ProjectManager projectManager = new ProjectManager("DTN");
    Project project = new Project();

    @Test(expected = Exception.class)
    public void testInputDataSetA() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addProject(project);
        plannerApplication.assignProjManToProject("KBC", project.getProjectID());
        plannerApplication.logout(admin.getInitials());
    }

    @Test(expected = Exception.class)
    public void testInputDataSetB() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(employee);
        plannerApplication.assignProjManToProject(employee.getInitials(), project.getProjectID()); // Project not added to planner
    }

    @Test
    public void testInputDataSetC() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(employee);
        plannerApplication.addProject(project);
        plannerApplication.assignProjManToProject(employee.getInitials(), project.getProjectID());
        assertTrue(plannerApplication.getUser(employee.getInitials()) instanceof ProjectManager);
        assertEquals(project.getProjectManager().getInitials(), employee.getInitials());
    }

    @Test
    public void testInputDataSetD() throws Exception {
        plannerApplication.login(admin.getInitials());
        plannerApplication.addUser(projectManager);
        plannerApplication.addProject(project);
        plannerApplication.assignProjManToProject(projectManager.getInitials(), project.getProjectID());
        assertEquals(project.getProjectManager().getInitials(), projectManager.getInitials());
    }




}
