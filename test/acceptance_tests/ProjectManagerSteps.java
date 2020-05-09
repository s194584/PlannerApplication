package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.*;

import static org.junit.Assert.*;

public class ProjectManagerSteps {
    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ProjectHelper projectHelper;
    ActivityHelper activityHelper;
    ErrorMessageHelper errorMessageHelper;


    public ProjectManagerSteps(PlannerApplication plannerApplication,
                               UserHelper userHelper,
                               ProjectHelper projectHelper,
                               ActivityHelper activityHelper,
                               ErrorMessageHelper errorMessageHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.projectHelper = projectHelper;
        this.activityHelper = activityHelper;
        this.errorMessageHelper = errorMessageHelper;
    }

    @And("there is a project manager with initials {string}")
    public void thereIsAProjectManager(String initials) {
        userHelper.setUser(new ProjectManager(initials));
    }

    @When("the admin assigns the project manager to the project")
    public void theAdminAssignsTheProjectManagerToTheProject() {
        try {
            plannerApplication.assignProjManToProject(userHelper.getUser().getInitials(), projectHelper.getProject().getProjectID());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @Then("the project manager is assigned to the project")
    public void theProjectManagerIsAssignedToTheProject() {
        assertEquals(projectHelper.getProject().getProjectManager().getInitials(), userHelper.getUser().getInitials());
    }

    @And("the project manager is added to the planner")
    public void theProjectManagerIsAddedToThePlanner() throws Exception {
        plannerApplication.addUser(userHelper.getUser());
    }

    @When("the admin assigns the employee as project manager to the project")
    public void theAdminAssignsTheEmployeeAsProjectManagerToTheProject() throws Exception {
        plannerApplication.assignProjManToProject(userHelper.getUser().getInitials(), projectHelper.getProject().getProjectID());

    }

    @Then("the employee is assigned as project manager to the project")
    public void theEmployeeIsAssignedAsProjectManagerToTheProject() {
        assertEquals(projectHelper.getProject().getProjectManager().getInitials(), userHelper.getUser().getInitials());
    }

    @And("the project manager is not assigned to the project")
    public void theProjectManagerIsNotAssignedToTheProject() {
        assertFalse(projectHelper.getProject().hasProjectManager());
    }

//    @And("the user is project manager")
//    public void theUserIsProjectManager() throws Exception {
//        plannerApplication.addUser(new Employee("HBL"));
//        plannerApplication.assignProjManToProject("HBL",projectHelper.getProject().getProjectID());
//    }

    @And("the project manager assigns employee {string} to the activity in the project")
    public void theProjectManagerAssignsEmployeeToTheActivityInTheProject(String initials) {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        Activity act = project.getActivity(activityHelper.getActivity().getID());
        Employee emp = (Employee) plannerApplication.getUser(initials);
        emp.assignActivity(act);
    }

    @And("the admin assigns the employee {string} as project manager to the project")
    public void theAdminAssignsTheEmployeeAsProjectManagerToTheProject(String initials) {
        projectHelper.getProject().setProjectManager((ProjectManager) plannerApplication.getUser(initials));
    }

    @When("the project manager assigns employee \\{string} to the activity in the project")
    public void theProjectManagerAssignsEmployeeStringToTheActivityInTheProject() {

    }
}
