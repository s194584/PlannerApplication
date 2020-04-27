package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.PlannerApplication;
import planner.app.ProjectManager;

import static org.junit.Assert.*;

public class ProjectManagerSteps {
    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ProjectHelper projectHelper;
    ErrorMessageHelper errorMessageHelper;

    public ProjectManagerSteps(PlannerApplication plannerApplication,
                               UserHelper userHelper,
                               ProjectHelper projectHelper,
                               ErrorMessageHelper errorMessageHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.projectHelper = projectHelper;
        this.errorMessageHelper = errorMessageHelper;
    }

    @And("there is a project manager with initials {string}")
    public void thereIsAProjectManager(String initials) {
        userHelper.setUser(new ProjectManager(initials));
    }

    @When("the admin assigns the project manager to the project")
    public void theAdminAssignsTheProjectManagerToTheProject() {
        try {
            plannerApplication.assignProjManToProject(userHelper.getUser().getInitials(), projectHelper.getProject().getID());
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
        plannerApplication.assignProjManToProject(userHelper.getUser().getInitials(), projectHelper.getProject().getID());

    }

    @Then("the employee is assigned as project manager to the project")
    public void theEmployeeIsAssignedAsProjectManagerToTheProject() {
        assertEquals(projectHelper.getProject().getProjectManager().getInitials(), userHelper.getUser().getInitials());
    }

    @And("the project manager is not assigned to the project")
    public void theProjectManagerIsNotAssignedToTheProject() {
        assertFalse(projectHelper.getProject().hasProjectManager());
    }
}
