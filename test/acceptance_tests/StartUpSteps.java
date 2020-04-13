package acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import planner.app.PlannerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StartUpSteps {
    PlannerApplication plannerApplication;

    @Given("a planner application exists")
    public void aPlannerApplicationExists() {
        plannerApplication = new PlannerApplication();
    }

    @Then("a admin {string} exists")
    public void aAdminExists(String arg0) {
        assertEquals(plannerApplication.getAdmin().getInitials(), arg0);
    }
}
