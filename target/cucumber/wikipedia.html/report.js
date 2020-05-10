$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/AddRemoveActivity.feature");
formatter.feature({
  "name": "A project is able to have several activities",
  "description": "  Description:\n  Actor: Project manager",
  "keyword": "Feature"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add empty activity to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add activity to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the planner has 0 activities",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.PlannerSteps.thePlannerHasActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithNameDescriptionStartDateEndDateTimeUsageAndAGivenID(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and same ID is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the planner has 1 activities",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.PlannerSteps.thePlannerHasActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change information of activity in planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithNameDescriptionStartDateEndDateTimeUsageAndAGivenID(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and same ID is in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager changes the planner-activity\u0027s to \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"10-09-2020\", time usage 0.0",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerChangesThePlannerActivitySToDescriptionStartDateEndDateTimeUsage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"10-09-2020\", time usage 0.0 and same ID is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity from planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager removes the activity from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerRemovesTheActivityFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove activity from project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager removes the activity from the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerRemovesTheActivityFromTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add activity to existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project has 0 activities",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectHasActivities(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager adds the activity to the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerAddsTheActivityToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProjectInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change information of activity in project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithNameDescriptionStartDateEndDateTimeUsageAndAGivenID(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and same ID is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager changes the project-activity\u0027s name to \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"10-09-2020\", time usage 0.0",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerChangesTheProjectActivitySNameToDescriptionStartDateEndDateTimeUsage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"10-09-2020\", time usage 0.0 and same ID is in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Choose end date for an activity which is before start date",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithNameDescriptionStartDateEndDateTimeUsageAndAGivenID(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"ActivityName\", description \"An activity\", start date \"06-05-2020\", end date \"01-06-2020\", time usage 11.5 and same ID is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager changes the project-activity\u0027s name to \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"06-09-2020\", time usage 0.0",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerChangesTheProjectActivitySNameToDescriptionStartDateEndDateTimeUsage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"End date must be after start date\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with name \"Roadtrip\", description \"Event for senior employees\", start date \"07-09-2020\", end date \"08-09-2020\", time usage 0.0 and same ID is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithNameDescriptionStartDateEndDateTimeUsageAndSameIDIsInTheProject(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee can be assigned to an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"ABC\" to the activity in the project",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"ABC\" is assigned to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeIsAssignedToTheActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to add non-existent activity to existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the planner has no activities",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.PlannerSteps.thePlannerHasNoActivities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager adds the activity with id 1 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerAddsTheActivityWithIdToTheProject(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Activity does not exist\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity with id 1 is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityWithIdIsNotInTheProject(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee attempts to add activity to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"ABC\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee adds the activity to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeAddsTheActivityToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Not authorized to add/remove activity\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to remove non-existent activity from project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager removes the activity from the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerRemovesTheActivityFromTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Activity does not exist\" is shown",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A project and a project manager exists in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to remove non-existent activity from planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager removes the activity from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theProjectManagerRemovesTheActivityFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Activity does not exist\" is shown",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/AddRemoveEmployee.feature");
formatter.feature({
  "name": "Add and remove employees",
  "description": "  Description:\n  Actor: Admin",
  "keyword": "Feature"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add an employee to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"HBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"HBL\" is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.anEmployeeWithInitialsIsNotInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.PlannerSteps.theEmployeeIsInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove an employee from planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"HBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"HBL\" is not in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.anEmployeeWithInitialsIsNotInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to add employee with non-alphanumeric initials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \")A6`\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Initials must be 1 to 4 alphanumeric characters\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \")A6`\" is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.anEmployeeWithInitialsIsNotInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to remove an employee that is not in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"HBL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"HBL\" is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.anEmployeeWithInitialsIsNotInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User does not exist\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to add employee already in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"HBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User already exists\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to remove yourself",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"000\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Admin cannot remove admin\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempt to add employee with not 1 to 4 initials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is an employee with initials \"ABCDE\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Initials must be 1 to 4 alphanumeric characters\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "The admin is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee attempts to remove user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"ABC\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an employee with initials \"HBL\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Only admin can add user\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"HBL\" is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.anEmployeeWithInitialsIsNotInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/AddRemoveProject.feature");
formatter.feature({
  "name": "Add and remove project",
  "description": "  Description:\n  Actor: Admin",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Admin creates a project with information and adds it to the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the planner has 0 projects",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thePlannerHasProjects(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Pandekagehuset\", description \"Website for Pandekagehuset\", start date \"30-09-2020\", end date \"24-03-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Pandekagehuset\", description \"Website for Pandekagehuset\", start date \"30-09-2020\", end date \"24-03-2021\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the planner has 1 projects",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thePlannerHasProjects(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin creates a project with information and adds it to the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin adds a project without information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin adds a project with name to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID and \"Kookle\" as name",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenIDAndAsName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with name \"Kookle\" and same ID is in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectWithNameAndSameIDIsInThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin removes a project to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin attempts to remove a project not in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project does not exist\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee attempts to add a project to planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminIsNotLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Not authorized to add/remove project\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee attempts to remove a project from planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is removed from the planner",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsRemovedFromThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Not authorized to add/remove project\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/AssignProjectManager.feature");
formatter.feature({
  "name": "Assign project manager to project",
  "description": "  Description:\n  Actor: Admin",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Admin assigns project manager to project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project manager with initials \"ABC\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.thereIsAProjectManager(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin assigns the project manager to the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theAdminAssignsTheProjectManagerToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager is assigned to the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerIsAssignedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin assigns employee as project manager to project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an employee with initials \"ABC\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.thereIsAnEmployeeWithInitials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theEmployeeIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin assigns the employee as project manager to the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theAdminAssignsTheEmployeeAsProjectManagerToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is assigned as project manager to the project",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theEmployeeIsAssignedAsProjectManagerToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Admin attempts to assign project manager to non-existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project manager with initials \"ABC\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.thereIsAProjectManager(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is not in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsNotInThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin assigns the project manager to the project",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theAdminAssignsTheProjectManagerToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Project does not exist\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager is not assigned to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerIsNotAssignedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/EmployeeActivity.feature");
formatter.feature({
  "name": "Employee gets assigned to activities correctly",
  "description": "  Description:\n  Actor: Project manager",
  "keyword": "Feature"
});
formatter.background({
  "name": "Get employees assigned to activity",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "these employees are contained in the planner",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theseEmployeesAreContainedInThePlanner(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"PRO\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin assigns the employee \"PRO\" as project manager to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theAdminAssignsTheEmployeeAsProjectManagerToTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"PRO\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employees are correctly assigned to activities",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project manager assigns employee \"BOB\" to the activity in the project",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"PKL\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"TUJ\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "these employees are assigned to the activity",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theseEmployeesAreAssignedToTheActivity(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasTheActivity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/EmployeeAvailable.feature");
formatter.feature({
  "name": "Check an employees availability by their activities",
  "description": "  Description:\n  Actor: Project manager",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Absent when selected start date is before absence period and selected end date is in absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"24-12-2020\" and selected end date \"03-01-2021\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Absent when selected start date is in absence period and selected end date is in absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"02-01-2020\" and selected end date \"04-01-2021\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Absent when selected start date is in absence period and selected end date is after absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"02-01-2020\" and selected end date \"11-01-2021\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Absent when selected start date is before absence period and selected end date is after absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"24-12-2020\" and selected end date \"10-01-2021\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not absent when selected start date is before absence period and selected end date is before absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"19-12-2020\" and selected end date \"23-12-2020\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is not absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsNotAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" has an absence activity with start date \"01-01-2021\" and end date \"06-01-2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeHasAnAbsenceActivityWithStartDateAndEndDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Not absent when selected start date is after absence period and selected end date is after absence period",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "selected start date is \"13-01-2021\" and selected end date \"17-01-2021\"",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.selectedStartDateIsAndSelectedEndDate(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee \"ABC\" is not absent",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.employeeIsNotAbsent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Description:\n  Actor: User",
  "keyword": "Feature"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login succeeds",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user \"HBL\" is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsNotLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \"HBL\" is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User logout succeeds",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \"HBL\" is not logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsNotLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login as employee",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user \"HBL\" is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsNotLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \"HBL\" is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is an \"Employee\" class",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsAnClass(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User fails to log in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"UIO\" logs in and is the current user",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User does not exist\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User login as admin",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"000\" logs in and is the current user",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \"000\" is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is an \"Admin\" class",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsAnClass(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Some employees exist in the planner",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"ABC\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Attempts to log out without being logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user \"ABC\" is not logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserIsNotLoggedIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \"ABC\" logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theUserLogsOut(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"User is not logged in\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/ModifyInformationInProject.feature");
formatter.feature({
  "name": "Modify project",
  "description": "  Description:\n  Actor: Admin",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Change name of a project in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin changes the name of the project to \"Lakseregisteret\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theAdminChangesTheNameOfTheProjectTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Lakseregisteret\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change description of a project in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin changes the description of the project to \"A fishy database\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theAdminChangesTheDescriptionOfTheProjectTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A fishy database\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change start date of a project in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin changes the start date of the project to \"23-06-2020\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theAdminChangesTheStartDateOfTheProjectTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"23-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change end date of a project in the planner",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"07-09-2020\" in the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin changes the end date of the project to \"11-08-2020\"",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theAdminChangesTheEndDateOfTheProjectTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with name \"Fiskebasen\", description \"A database for fish\", start date \"14-06-2020\", end date \"11-08-2020\" in the planner",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithNameDescriptionStartDateEndDateInThePlanner(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Startup.feature");
formatter.feature({
  "name": "Planner startup",
  "description": "  Description:\n  Actor: Planner Application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "A new Planner application is initialized",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "a planner application exists",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.StartUpSteps.aPlannerApplicationExists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user list \"users\" exists",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.StartUpSteps.aUserListExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a admin \"000\" exists",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.StartUpSteps.aAdminExists(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users contains admin \"000\"",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.StartUpSteps.usersContainsAdmin(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/TimeRegistration.feature");
formatter.feature({
  "name": "Employee can register time on activities",
  "description": "  Description:\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "There is a project, an activity in the project and an employee assigned to the project",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"TGB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"BOB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"TGB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"BOB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register time on activity in project assigned to",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"TGB\" has 0.0 hours registered to the activity",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 0.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers 7.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 7.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 7.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers 4.0 hours to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 11.0 hours registered to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 11.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 0.0 hours registered to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" registers 3.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 3.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 14.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "There is a project, an activity in the project and an employee assigned to the project",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"TGB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"BOB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"TGB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"BOB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register negative time on activity in project assigned to",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"TGB\" has 0.0 hours registered to the activity",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 0.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers 7.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 7.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 7.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers -3.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 4.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 4.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "There is a project, an activity in the project and an employee assigned to the project",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"TGB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"BOB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"TGB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"BOB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Total registered time cannot be negative",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"TGB\" has 0.0 hours registered to the activity",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers 7.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 7.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" registers -41.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Registered time cannot be negative\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.AdminSteps.theErrorMessageIsShown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" has 7.0 hours registered to the activity",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "There is a project, an activity in the project and an employee assigned to the project",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "there is a project with a given ID",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.thereIsAProjectWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is an activity with a given ID",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.thereIsAnActivityWithAGivenID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin login succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLoginSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"TGB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee \"BOB\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.anEmployeeIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a project manager \"HBL\" is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.aProjectManagerIsAddedToThePlanner(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is added to the planner",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theProjectIsAddedToThePlanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the admin logout succeeds",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theAdminLogoutSucceeds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"HBL\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity is added to the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityIsAddedToTheProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"TGB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project manager assigns employee \"BOB\" to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectManagerSteps.theProjectManagerAssignsEmployeeToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" is assigned to the activity in the project",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ProjectSteps.theEmployeeIsAssignedToTheActivityInTheProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"TGB\" logs in and is the current user",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Amount of time registered in session",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee \"BOB\" has 0.0 hours registered to the activity",
  "keyword": "Given "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 0.0 hours registered in session",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeHasHoursRegisteredInSession(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 0.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" registers 5.0 hours to the activity",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeRegistersHoursToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 5.0 hours registered to the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theEmployeeHasHoursRegisteredToTheActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 5.0 hours registered in session",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeHasHoursRegisteredInSession(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity has 5.0 registered hours",
  "keyword": "And "
});
formatter.match({
  "location": "acceptance_tests.ActivitySteps.theActivityHasRegisteredHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the current user logs out",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theCurrentUserLogsOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" logs in and is the current user",
  "keyword": "When "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeLogsInAndIsTheCurrentUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"BOB\" has 0.0 hours registered in session",
  "keyword": "Then "
});
formatter.match({
  "location": "acceptance_tests.UserSteps.theEmployeeHasHoursRegisteredInSession(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
});