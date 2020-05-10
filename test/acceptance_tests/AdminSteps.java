package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.Employee;
import planner.app.PlannerApplication;

import static org.junit.Assert.*;

// Ansvarlig: Malthe
public class AdminSteps {
    UserHelper userHelper;
    PlannerApplication plannerApplication;
    ErrorMessageHelper errorMessageHelper;

    public AdminSteps (PlannerApplication pa, UserHelper uh, ErrorMessageHelper errorMessageHelper){
        plannerApplication = pa;
        userHelper = uh;
        this.errorMessageHelper = errorMessageHelper;
    }

    @Given("there is an employee with initials {string}")
    public void thereIsAnEmployeeWithInitials(String string) {
        userHelper.setUser(new Employee(string));
    }

    @When("the employee is added to the planner")
    public void theEmployeeIsAddedToThePlanner() {
        try {
            plannerApplication.addUser(userHelper.getUser());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @Then("the employee is in the planner")
    public void theEmployeeIsInThePlanner() {
        assertTrue(plannerApplication.hasUser(userHelper.getUser()));
    }

    @And("an employee with initials {string} is not in the planner")
    public void anEmployeeWithInitialsIsNotInThePlanner(String initials) {
        assertFalse(plannerApplication.hasUser(initials));
    }

    @When("the employee is removed from the planner")
    public void theEmployeeIsRemovedFromThePlanner() {
        try {
            plannerApplication.removeUser(userHelper.getUser());
        } catch (Exception e) {
            errorMessageHelper.setErrorMessage(e.getMessage());
        }
    }

    @Then("the error message {string} is shown")
    public void theErrorMessageIsShown(String msg) {
        assertEquals(msg, errorMessageHelper.getErrorMessage());
    }
}
