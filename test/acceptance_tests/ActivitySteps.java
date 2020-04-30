package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Activity;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.ProjectManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ActivitySteps {

    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ActivityHelper activityHelper;

    public ActivitySteps(PlannerApplication plannerApplication, UserHelper userHelper, ActivityHelper activityHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.activityHelper = activityHelper;
    }

    @Given("a project manager {string} exists in the planner")
    public void anProjectManagerExistsInThePlanner(String arg0) throws Exception {
        userHelper.setUser(new ProjectManager(arg0));
        plannerApplication.addUser(userHelper.getUser());
    }

    @And("the employee is the current user")
    public void theEmployeeIsTheCurrentUser() {
        plannerApplication.login(userHelper.getUser().getInitials());
        assertEquals(plannerApplication.getCurrentUser(), userHelper.getUser());
    }

    @And("there is an activity with a given ID")
    public void thereIsAnActivityWithAGivenID() {
        activityHelper.setActivity(new Activity());
    }

    @When("the activity is added to the planner")
    public void theActivityIsAddedToThePlanner() throws Exception {
        plannerApplication.addActivity(activityHelper.getActivity());
    }

    @Then("the activity is in the planner")
    public void theActivityIsInThePlanner() {
        assertTrue(plannerApplication.hasActivity(activityHelper.getActivity()));
    }

}
