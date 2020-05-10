package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

// Ansvarlig: Christian
public class ActivitySteps {

    PlannerApplication plannerApplication;
    UserHelper userHelper;
    ActivityHelper activityHelper;
    ProjectHelper projectHelper;
    private ErrorMessageHelper errorMessageHelper;
    DateHelper dateHelper;

    public ActivitySteps(PlannerApplication plannerApplication, UserHelper userHelper,
                         ActivityHelper activityHelper, ProjectHelper projectHelper,
                         ErrorMessageHelper errorMessageHelper, DateHelper dateHelper) {
        this.plannerApplication = plannerApplication;
        this.userHelper = userHelper;
        this.activityHelper = activityHelper;
        this.projectHelper = projectHelper;
        this.errorMessageHelper = errorMessageHelper;
        this.dateHelper = dateHelper;
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
        Information info = new Information(name, description, DateMapper.transformToDate(startDate), DateMapper.transformToDate(endDate));
        Activity act = new Activity(info, timeUsage);
        activityHelper.setActivity(act);
    }

    @Then("the activity with name {string}, description {string}, start date {string}, end date {string}, time usage {double} and same ID is in the planner")
    public void theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInThePlanner(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = plannerApplication.getActivity(activityHelper.getActivity().getID());
        Information info = act.getInformation();
        assertEquals(info.getName(), name);
        assertEquals(info.getDescription(), description);
        assertEquals(info.getStartDate(), DateMapper.transformToDate(startDate));
        assertEquals(info.getEndDate(), DateMapper.transformToDate(endDate));
        assertEquals(act.getEstimatedTimeUsage(), timeUsage, 0.0);
    }

    @When("the project manager changes the planner-activity's to {string}, description {string}, start date {string}, end date {string}, time usage {double}")
    public void theProjectManagerChangesThePlannerActivitySToDescriptionStartDateEndDateTimeUsage(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = plannerApplication.getActivity(activityHelper.getActivity().getID());
        Information info = act.getInformation();
        info.setName(name);
        info.setDescription(description);
        info.setStartDate(DateMapper.transformToDate(startDate));
        info.setEndDate(DateMapper.transformToDate(endDate));
        act.setEstimatedTimeUsage(timeUsage);
    }

    @When("the project manager changes the project-activity's name to {string}, description {string}, start date {string}, end date {string}, time usage {double}")
    public void theProjectManagerChangesTheProjectActivitySNameToDescriptionStartDateEndDateTimeUsage(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = projectHelper.getProject().getActivity(activityHelper.getActivity().getID());
        Information info = act.getInformation();
        info.setName(name);
        info.setDescription(description);
        info.setStartDate(DateMapper.transformToDate(startDate));
        act.setEstimatedTimeUsage(timeUsage);
        try {
            info.setEndDate(DateMapper.transformToDate(endDate));
        } catch (IllegalArgumentException ex) {
            errorMessageHelper.setErrorMessage("End date must be after start date");
        }

    }

    @Then("the activity with name {string}, description {string}, start date {string}, end date {string}, time usage {double} and same ID is in the project")
    public void theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(
            String name, String description, String startDate, String endDate, double timeUsage) {
        Activity act = projectHelper.getProject().getActivity(activityHelper.getActivity().getID());
        Information info = act.getInformation();
        assertEquals(info.getName(), name);
        assertEquals(info.getDescription(), description);
        assertEquals(info.getStartDate(), DateMapper.transformToDate(startDate));
        assertEquals(info.getEndDate(), DateMapper.transformToDate(endDate));
        assertEquals(act.getEstimatedTimeUsage(), timeUsage, 0.0);
    }

    @When("the project manager removes the activity from the planner")
    public void theProjectManagerRemovesTheActivityFromThePlanner() {
        try {
            plannerApplication.removeActivity(activityHelper.getActivity().getID());
        } catch (NoSuchElementException e) {
            errorMessageHelper.setErrorMessage(e.getMessage());
        }
    }

    @When("the project manager removes the activity from the project")
    public void theProjectManagerRemovesTheActivityFromTheProject() {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        try {
            project.removeActivity(activityHelper.getActivity().getID());
        } catch (NoSuchElementException e) {
            errorMessageHelper.setErrorMessage(e.getMessage());
        }
    }

    @Then("the activity is not in the project")
    public void theActivityIsNotInTheProject() {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertFalse(project.hasActivity(activityHelper.getActivity().getID()));
    }

    @Then("the employee {string} is assigned to the activity")
    public void theEmployeeIsAssignedToTheActivity(String initials) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertTrue(emp.isAssignedToActivity(activityHelper.getActivity()));
    }

    @When("the employee {string} registers {double} hours to the activity")
    public void theEmployeeRegistersHoursToTheActivity(String initials, double hours) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        try {
            emp.registerTime(activityHelper.getActivity().getID(), hours);
        } catch (IllegalArgumentException e) {
            errorMessageHelper.setErrorMessage(e.getMessage());
        }
    }

    @Given("the employee {string} has {double} hours registered to the activity")
    public void theEmployeeHasHoursRegisteredToTheActivity(String initials, double hours) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        double hoursRegistered = emp.getRegisteredTime(activityHelper.getActivity().getID());
        assertEquals(hours, hoursRegistered, 0.0);
    }

    @And("the activity has {double} registered hours")
    public void theActivityHasRegisteredHours(double hours) {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        Activity act = project.getActivity(activityHelper.getActivity().getID());
        assertEquals(hours, act.getTotalTimeRegistered(), 0.0);
    }


    @Then("these employees are assigned to the activity")
    public void theseEmployeesAreAssignedToTheActivity(List<String> listOfInitials) {
        ArrayList<Employee> assignedEmployees = plannerApplication.getEmployeesAssignedToActivity(activityHelper.getActivity());
        assertEquals(listOfInitials.size(), assignedEmployees.size());
        boolean sameElems = true;
        for (Employee emp : assignedEmployees) {
            if (!listOfInitials.contains(emp.getInitials())) {
                sameElems = false;
                break;
            }
        }
        assertTrue(sameElems);
    }

    @And("the employee {string} has the activity")
    public void theEmployeeHasTheActivity(String initials) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        List<Activity> acts = emp.getActivities();
        assertTrue(acts.contains(activityHelper.getActivity()));
    }

    @And("employee {string} has an absence activity with start date {string} and end date {string}")
    public void employeeHasAnAbsenceActivityWithStartDateAndEndDate(String initials, String startDateStr, String endDateStr) {
        AbsenceActivity activity = new AbsenceActivity();
        Information info = activity.getInformation();
        info.setStartDate(DateMapper.transformToDate(startDateStr));
        info.setEndDate(DateMapper.transformToDate(endDateStr));
        Employee emp = (Employee) plannerApplication.getUser(initials);
        emp.assignActivity(activity);
    }

    @Given("there is an activity with start date {string} and end date {string}")
    public void thereIsAnActivityWithStartDateAndEndDate(String startDateStr, String endDateStr) {
        Information info = new Information("", "", DateMapper.transformToDate(startDateStr), DateMapper.transformToDate(endDateStr));
        Activity act = new Activity(info, 0.0);
        activityHelper.setActivity(act);
    }

    @And("the employee {string} is not assigned to the activity in the project")
    public void theEmployeeIsNotAssignedToTheActivityInTheProject(String initials) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertFalse(emp.isAssignedToActivity(activityHelper.getActivity().getID()));
    }

    @Given("selected start date is {string} and selected end date {string}")
    public void selectedStartDateIsAndSelectedEndDate(String startDateStr, String endDateStr) {
        dateHelper.setStartDate(DateMapper.transformToDate(startDateStr));
        dateHelper.setEndDate(DateMapper.transformToDate(endDateStr));
    }

    @Then("employee {string} is absent")
    public void employeeIsAbsent(String initials) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertTrue(emp.isAbsent(dateHelper.getStartDate(), dateHelper.getEndDate()));
    }

    @Then("employee {string} is not absent")
    public void employeeIsNotAbsent(String initials) {
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertFalse(emp.isAbsent(dateHelper.getStartDate(), dateHelper.getEndDate()));
    }
}
