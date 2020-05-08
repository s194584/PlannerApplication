package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.*;

import static org.junit.Assert.*;

public class UserSteps {
    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ErrorMessageHelper errorMessageHelper;

    public UserSteps (PlannerApplication plannerApplication, UserHelper userHelper, ErrorMessageHelper errorMessageHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.errorMessageHelper = errorMessageHelper;
    }

    @Given("an employee {string} is added to the planner")
    public void anEmployeeIsAddedToThePlanner(String initials) throws Exception {
        plannerApplication.addUser(new Employee(initials));
    }

    @Then("the user {string} is logged in")
    public void theUserIsLoggedIn(String initials) {
        User user = plannerApplication.getUser(initials);
        assertTrue(user.getLoginStatus());
    }

    @Then("the user {string} is not logged in")
    public void theUserIsNotLoggedIn(String initials) {
        User user = plannerApplication.getUser(initials);
        assertFalse(user.getLoginStatus());
    }

//    @And("the user is not logged in")
//    public void theUserIsNotLoggedIn() {
//        assertFalse(userHelper.getUser().getLoginStatus());
//    }

    @Given("the admin is logged in")
    public void theAdminIsLoggedIn() {
        assertTrue(plannerApplication.getAdmin().getLoginStatus());
    }

    @Given("the admin is not logged in")
    public void theAdminIsNotLoggedIn() {
        assertFalse(plannerApplication.getAdmin().getLoginStatus());
    }

    @And("the user is an {string} class")
    public void theUserIsAnClass(String arg0) throws ClassNotFoundException {
        assertSame(plannerApplication.getCurrentUser().getClass(), Class.forName("planner.app."+arg0));
    }

    @When("the admin logout succeeds")
    public void theAdminLogoutSucceeds() {
        assertTrue(plannerApplication.logout(plannerApplication.getAdmin().getInitials()));
    }

    @When("the admin login succeeds")
    public void theAdminLoginSucceeds() {
        assertTrue(plannerApplication.login(plannerApplication.getAdmin().getInitials()));
    }

    @And("the employee {string} logs in and is the current user")
    public void theEmployeeLogsInAndIsTheCurrentUser(String initials) {
        if (!plannerApplication.login(initials));
            errorMessageHelper.setErrorMessage("User does not exist");
        assertEquals(plannerApplication.getCurrentUser().getInitials(), initials);
    }

    @And("the current user logs out")
    public void theCurrentUserLogsOut() {
        plannerApplication.logout(plannerApplication.getCurrentUser().getInitials());
    }

    @When("the user {string} logs out")
    public void theUserLogsOut(String initials) {
        if (!plannerApplication.logout(initials))
            errorMessageHelper.setErrorMessage("User is not logged in");
    }

    @Then("the employee {string} has {double} hours registered in session")
    public void theEmployeeHasHoursRegisteredInSession(String initials, double hours) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertEquals(hours, emp.getRegisteredTimeInSession(), 0.0);
    }
}
