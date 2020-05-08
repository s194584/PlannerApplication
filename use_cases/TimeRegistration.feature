Feature: Employee can register time on activities
  Description:
  Actor: Employee

  Background: There is a project, an activity in the project and an employee assigned to the project
    Given there is a project with a given ID
    And there is an activity with a given ID
    And the admin login succeeds
    And an employee "TGB" is added to the planner
    And a project manager "HBL" is added to the planner
    And the project is added to the planner
    And the activity is added to the project
    And the admin logout succeeds
    And the employee "HBL" logs in and is the current user
    And the activity is added to the project
    And the project manager assigns employee "TGB" to the activity in the project
    And the employee "TGB" is assigned to the activity in the project
	And the current user logs out
    And the employee "TGB" logs in and is the current user

#  Scenario: Register time on activity in project assigned to

