package acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.User;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserSteps {
    PlannerApplication pa = new PlannerApplication();

    @Given("the admin is not logged in")
    public void theAdminIsNotLoggedIn() {
       assertFalse(pa.getAdmin().getLoginStatus());
    }

    @Then("the admin login succeeds")
    public void theAdminLoginSucceeds() {

    }

    @Then("the admin is logged in")
    public void theAdminIsLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("that the admin is not logged in")
    public void thatTheAdminIsNotLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the password is {string}")
    public void thePasswordIs(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the admin login fails")
    public void theAdminLoginFails() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
