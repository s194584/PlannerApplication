package acceptance_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import planner.app.*;

import static org.junit.Assert.*;

// Ansvarlig: Christopher
public class ProjectSteps {
    ProjectHelper projectHelper;
    PlannerApplication plannerApplication;
    ErrorMessageHelper errorMessageHelper;
    ActivityHelper activityHelper;

    public ProjectSteps(ProjectHelper projectHelper, PlannerApplication plannerApplication,
                        ErrorMessageHelper errorMessageHelper, ActivityHelper activityHelper) {
        this.projectHelper = projectHelper;
        this.plannerApplication = plannerApplication;
        this.errorMessageHelper = errorMessageHelper;
        this.activityHelper = activityHelper;
    }

    @And("there is a project with a given ID")
    public void thereIsAProjectWithAGivenID() {
        projectHelper.setProject(new Project());
    }

    @When("the project is added to the planner")
    public void theProjectIsAddedToThePlanner() {
        try {
            plannerApplication.addProject(projectHelper.getProject());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }
    }

    @Then("the project is in the planner")
    public void theProjectIsInThePlanner() {
        assertTrue(plannerApplication.hasProject(projectHelper.getProject()));
    }

    @When("the project is removed from the planner")
    public void theProjectIsRemovedFromThePlanner() {
        try {
            plannerApplication.removeProject(projectHelper.getProject());
        } catch (Exception ex) {
            errorMessageHelper.setErrorMessage(ex.getMessage());
        }

    }

    @Then("the project is not in the planner")
    public void theProjectIsNotInThePlanner() {
        assertFalse(plannerApplication.hasProject(projectHelper.getProject()));
    }

    @And("there is a project with a given ID and {string} as name")
    public void thereIsAProjectWithAGivenIDAndAsName(String projectName) {
        projectHelper.setProject(new Project(projectName));
    }

    @Then("the project with name {string} and same ID is in the planner")
    public void theProjectWithNameAndSameIDIsInThePlanner(String projectName) throws Exception {
        //theProjectIsInThePlanner();
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        assertEquals(projectName, project.getInformation().getName());
    }

    @And("there is a project with name {string}, description {string}, start date {string}, end date {string}")
    public void thereIsAProjectWithNameDescriptionStartDateEndDate(String name, String description, String startDate, String endDate) {
        Information info = new Information(name, description, DateMapper.transformToDate(startDate), DateMapper.transformToDate(endDate));
        Project project = new Project(info);
        projectHelper.setProject(project);
    }

    @Then("there is a project with name {string}, description {string}, start date {string}, end date {string} in the planner")
    public void thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(String name, String description, String startDate, String endDate) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        Information info = project.getInformation();
        assertEquals(info.getName(), name);
        assertEquals(info.getDescription(), description);
        assertEquals(info.getStartDate(), DateMapper.transformToDate(startDate));
        assertEquals(info.getEndDate(), DateMapper.transformToDate(endDate));
    }

    @When("the admin changes the description of the project to {string}")
    public void theAdminChangesTheDescriptionOfTheProjectTo(String description) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        project.getInformation().setDescription(description);
    }

    @When("the admin changes the start date of the project to {string}")
    public void theAdminChangesTheStartDateOfTheProjectTo(String startDate) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        project.getInformation().setStartDate(DateMapper.transformToDate(startDate));
    }

    @When("the admin changes the end date of the project to {string}")
    public void theAdminChangesTheEndDateOfTheProjectTo(String endDate) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        project.getInformation().setEndDate(DateMapper.transformToDate(endDate));
    }

    @When("the admin changes the name of the project to {string}")
    public void theAdminChangesTheNameOfTheProjectTo(String name) throws Exception {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        project.getInformation().setName(name);
    }

    @And("the employee {string} is assigned to the activity in the project")
    public void theEmployeeIsAssignedToTheActivityInTheProject(String initials) {
        Project project = plannerApplication.getProject(projectHelper.getProject().getProjectID());
        Activity act = project.getActivity(activityHelper.getActivity().getID());
        Employee emp = (Employee) plannerApplication.getUser(initials);
        assertTrue(emp.isAssignedToActivity(act));
    }

    @And("the project's toString is {string}")
    public void theProjectSToStringIs(String projectName) {
        assertEquals(projectName, projectHelper.getProject().toString());
    }

    @And("the planner has {int} projects")
    public void thePlannerHasProjects(int n) {
        assertEquals(n, plannerApplication.getProjects().size());
    }

    @And("the project has {int} activities")
    public void theProjectHasActivities(int n) {
        assertEquals(n, projectHelper.getProject().getNumberOfActivities());
    }
}
