package acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import planner.app.PlannerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// Ansvarlig: Christian
public class StartUpSteps {
    PlannerApplication plannerApplication;

    @Given("a planner application exists")
    public void aPlannerApplicationExists() {
        plannerApplication = new PlannerApplication();
    }

    @Then("a user list {string} exists")
    public void aUserListExists(String string) {
        assertTrue(plannerApplication.getUsers().size()>=0);
    }

    @Then("users contains admin {string}")
    public void usersContainsAdmin(String string) {
        assertEquals(plannerApplication.getUsers().get(0).getInitials(), string);
    }

    @Then("a admin {string} exists")
    public void aAdminExists(String arg0) {
        assertEquals(plannerApplication.getAdmin().getInitials(), arg0);
    }
}
