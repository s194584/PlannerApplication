package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.*;

import java.util.NoSuchElementException;
import java.util.logging.LogRecord;

import static org.junit.Assert.*;

public class ActivitySteps {

    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ActivityHelper activityHelper;
    ProjectHelper projectHelper;
    private ErrorMessageHelper errorMessageHelper;

    public ActivitySteps(PlannerApplication plannerApplication, UserHelper userHelper,
                         ActivityHelper activityHelper, ProjectHelper projectHelper,
                         ErrorMessageHelper errorMessageHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.activityHelper = activityHelper;
        this.projectHelper = projectHelper;
        this.errorMessageHelper = errorMessageHelper;
    }

    @Given("a project manager {string} exists in the planner")
    public void anProjectManagerExistsInThePlanner(String arg0) throws Exception {
        userHelper.setUser(new ProjectManager(arg0));
        plannerApplication.addUser(userHelper.getUser());
    }

    @And("the employee logs in and is the current user")
    public void theEmployeeIsTheCurrentUser() {
        plannerApplication.login(userHelper.getUser().getInitials());
        assertEquals(plannerApplication.getCurrentUser(), userHelper.getUser());
    }

    @And("there is an activity with a given ID")
    public void thereIsAnActivityWithAGivenID() {
        activityHelper.setActivity(new Activity());
    }

    @When("the activity is added to the planner")
    public void theActivityIsAddedToThePlanner() throws IllegalAccessException {
        plannerApplication.addActivity(activityHelper.getActivity());
    }

    @Then("the activity is in the planner")
    public void theActivityIsInThePlanner() {
        assertTrue(plannerApplication.hasActivity(activityHelper.getActivity()));
    }

    @When("the project manager adds the activity to the project")
    public void theProjectManagerAddsTheActivityToTheProject() {
        try {
            int activityID = activityHelper.getActivity().getID();

            int projectID = projectHelper.getProject().getProjectID();
            plannerApplication.addActivityToProject(activityID, projectID);
        } catch (NoSuchElementException ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @Then("the activity is added to the project in the planner")
    public void theActivityIsAddedToTheProjectInThePlanner() {
        int activityID = activityHelper.getActivity().getID();
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertTrue(project.hasActivity(activityID));
    }

    @When("the project manager adds the activity with id {int} to the project")
    public void theProjectManagerAddsTheActivityWithIdToTheProject(int activityID) {
        try {
            plannerApplication.addActivityToProject(activityID,
                    projectHelper.getProject().getProjectID());
        } catch (NoSuchElementException ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @And("the activity with id {int} is not in the project")
    public void theActivityWithIdIsNotInTheProject(int activityID) {
        assertFalse(projectHelper.getProject().hasActivity(activityID));
    }

    @When("the employee adds the activity to the planner")
    public void theEmployeeAddsTheActivityToThePlanner() {
        try {
            plannerApplication.addActivity(activityHelper.getActivity());
        } catch (IllegalAccessException e) {
            errorMessageHelper.setErrorMessage(e.getMessage());
        }
    }

    @And("the activity is not in the planner")
    public void theActivityIsNotInThePlanner() {
        assertFalse(plannerApplication.hasActivity(activityHelper.getActivity()));
    }
}
