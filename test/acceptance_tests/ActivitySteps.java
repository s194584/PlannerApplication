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

    @Given("a project manager {string} is added to the planner")
    public void aProjectManagerIsAddedToThePlanner(String initials) throws Exception {
        plannerApplication.addUser(new ProjectManager(initials));
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

    @When("the activity is added to the project")
    public void theActivityIsAddedToTheProject() {
        projectHelper.getProject().addActivity(activityHelper.getActivity());
    }

    @Then("the activity is in the project")
    public void theActivityIsInTheProject() {
        assertTrue(projectHelper.getProject().hasActivity(activityHelper.getActivity().getID()));
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

    @And("there is an activity with name {string}, description {string}, start date {string}, end date {string}, time usage {double} and a given ID")
    public void thereIsAnActivityWithNameDescriptionStartDateEndDateTimeUsageAndAGivenID(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Information info = new Information(name, description, startDate, endDate);
        Activity act = new Activity(info, timeUsage);
        activityHelper.setActivity(act);
    }

    @Then("the activity with name {string}, description {string}, start date {string}, end date {string}, time usage {double} and same ID is in the planner")
    public void theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInThePlanner(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act1 = plannerApplication.getActivity(activityHelper.getActivity().getID());
        assertEquals(act1.getName(), name);
        assertEquals(act1.getDescription(), description);
        assertEquals(act1.getStartDate(), startDate);
        assertEquals(act1.getEndDate(), endDate);
        assertEquals(act1.getTimeUsage(), timeUsage, 0.0);
    }

    @When("the project manager changes the planner-activity's to {string}, description {string}, start date {string}, end date {string}, time usage {double}")
    public void theProjectManagerChangesThePlannerActivitySToDescriptionStartDateEndDateTimeUsage(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = plannerApplication.getActivity(activityHelper.getActivity().getID());
        act.setName(name);
        act.setDescription(description);
        act.setStartDate(startDate);
        act.setEndDate(endDate);
        act.setTimeUsage(timeUsage);
    }

    @When("the project manager changes the project-activity's name to {string}, description {string}, start date {string}, end date {string}, time usage {double}")
    public void theProjectManagerChangesTheProjectActivitySNameToDescriptionStartDateEndDateTimeUsage(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = projectHelper.getProject().getActivity(activityHelper.getActivity().getID());
        act.setName(name);
        act.setDescription(description);
        act.setStartDate(startDate);
        act.setEndDate(endDate);
        act.setTimeUsage(timeUsage);
    }

    @Then("the activity with name {string}, description {string}, start date {string}, end date {string}, time usage {double} and same ID is in the project")
    public void theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act1 = projectHelper.getProject().getActivity(activityHelper.getActivity().getID());
        assertEquals(act1.getName(), name);
        assertEquals(act1.getDescription(), description);
        assertEquals(act1.getStartDate(), startDate);
        assertEquals(act1.getEndDate(), endDate);
        assertEquals(act1.getTimeUsage(), timeUsage, 0.0);
    }

    @When("the project manager removes the activity from the planner")
    public void theProjectManagerRemovesTheActivityFromThePlanner() {
        plannerApplication.removeActivity(activityHelper.getActivity().getID());
    }

    @When("the project manager removes the activity from the project")
    public void theProjectManagerRemovesTheActivityFromTheProject() {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        project.removeActivity(activityHelper.getActivity().getID());
    }

    @Then("the activity is not in the project")
    public void theActivityIsNotInTheProject() {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertFalse(project.hasActivity(activityHelper.getActivity().getID()));
    }
}
