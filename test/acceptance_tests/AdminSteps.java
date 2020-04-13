package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Employee;
import planner.app.PlannerApplication;
import planner.app.User;

import static org.junit.Assert.assertTrue;

public class AdminSteps {
    UserHelper userHelper;
    PlannerApplication plannerApplication;

    public AdminSteps (PlannerApplication pa, UserHelper uh){
        plannerApplication = pa;
        userHelper = uh;
    }

    @Given("there is an employee with initials {string}")
    public void thereIsAnEmployeeWithInitials(String string) {
        userHelper.setUser(new Employee(string));
    }

    @When("the employee is added to the planner")
    public void theEmployeeIsAddedToThePlanner() {
        plannerApplication.addUser(userHelper.getUser());
    }

    @Then("the employee is in the planner")
    public void theEmployeeIsInThePlanner() {
        assertTrue(plannerApplication.getUsers().contains(userHelper.getUser()));
    }

}
