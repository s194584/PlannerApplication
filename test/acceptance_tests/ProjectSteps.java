package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.PlannerApplication;
import planner.app.Project;

import static org.junit.Assert.*;

public class ProjectSteps {
    ProjectHelper projectHelper;
    PlannerApplication plannerApplication;
    ErrorMessageHelper errorMessageHelper;

    public ProjectSteps(ProjectHelper projectHelper, PlannerApplication plannerApplication, ErrorMessageHelper errorMessageHelper) {
        this.projectHelper = projectHelper;
        this.plannerApplication = plannerApplication;
        this.errorMessageHelper = errorMessageHelper;
    }

    @And("there is a project with a given ID")
    public void thereIsAProjectWithAGivenID() {
        projectHelper.setProject(new Project());
    }

    @When("the project is added to the planner")
    public void theProjectIsAddedToThePlanner() {
        try {
            plannerApplication.addProject(projectHelper.getProject());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @Then("the project is in the planner")
    public void theProjectIsInThePlanner() {
        assertTrue(plannerApplication.hasProject(projectHelper.getProject()));
    }

    @When("the project is removed from the planner")
    public void theProjectIsRemovedFromThePlanner() {
        try {
            plannerApplication.removeProject(projectHelper.getProject());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }

    }

    @Then("the project is not in the planner")
    public void theProjectIsNotInThePlanner() {
        assertFalse(plannerApplication.hasProject(projectHelper.getProject()));
    }

    @And("there is a project with a given ID and {string} as name")
    public void thereIsAProjectWithAGivenIDAndAsName(String projectName) {
        projectHelper.setProject(new Project(projectName));
    }

    @Then("the project with name {string} and same ID is in the planner")
    public void theProjectWithNameAndSameIDIsInThePlanner(String projectName) throws Exception {
        //theProjectIsInThePlanner();
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertEquals(projectName, project.getProjectName());
    }

    @When("the name of the project is changed to {string}")
    public void theNameOfTheProjectIsChangedTo(String projectName) {
        projectHelper.getProject().setProjectName(projectName);
    }

    @Then("the name of the project in the planner is changed to {string}")
    public void theNameOfTheProjectInThePlannerIsChangedTo(String projectName) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertEquals(projectName, project.getProjectName());
    }
}
