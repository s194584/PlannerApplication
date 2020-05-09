package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import planner.app.PlannerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlannerSteps {

    PlannerApplication plannerApplication;

    public PlannerSteps(PlannerApplication plannerApplication) {
        this.plannerApplication = plannerApplication;
    }
    @And("the planner has no activities")
    public void thePlannerHasNoActivities() {
        assertEquals(0, plannerApplication.getNumberOfActivities());
    }

    @Then("the employee {string} is in the planner")
    public void theEmployeeIsInThePlanner(String initials) {
        assertTrue(plannerApplication.hasUser(initials));
    }

    @Given("the planner has {int} activities")
    public void thePlannerHasActivities(int n) {
        assertEquals(n, plannerApplication.getNumberOfActivities());
    }
}
