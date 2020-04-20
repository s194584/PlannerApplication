package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.User;

import static org.junit.Assert.*;

public class UserSteps {
    PlannerApplication plannerApplication;
    UserHelper userHelper;
    public UserSteps (PlannerApplication pa, UserHelper uh){
        plannerApplication = pa;
        userHelper = uh;
    }

    @Given("an employee {string} exists in the planner")
    public void anUserExistsInThePlanner(String arg0) throws Exception {
        userHelper.setUser(new Employee(arg0));
        plannerApplication.addUser(userHelper.getUser());
    }

    @When("the login {string} is entered")
    public void theLoginIsEntered(String arg0) {
        plannerApplication.login(arg0);
    }

    @Then("the user {string} is logged in")
    public void theUserIsLoggedIn(String arg0) {
        User user = plannerApplication.getUser(arg0);
        assertTrue(user.getLoginStatus());
    }

    @And("the user is an employee")
    public void theUserIsAnEmployee() {
        assertSame(userHelper.getUser().getClass(), Employee.class);
    }

    @Then("the user {string} is not logged in")
    public void theUserIsNotLoggedIn(String arg0) {
        User u = plannerApplication.getUser(arg0);
        assertFalse(u.getLoginStatus());
    }

    @And("the user is not logged in")
    public void theUserIsNotLoggedIn() {
        userHelper.getUser().login(false);
    }

    @Given("the admin is not logged in")
    public void theAdminIsNotLoggedIn() {
        plannerApplication.getAdmin().login(false);
    }

    @And("the user is an {string} class")
    public void theUserIsAnClass(String arg0) throws ClassNotFoundException {
        assertSame(userHelper.getUser().getClass(), Class.forName("planner.app."+arg0));
    }

    @Given("the user is the admin")
    public void theUserIsTheAdmin() {
        userHelper.setUser(plannerApplication.getAdmin());
    }
}
