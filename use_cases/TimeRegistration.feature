Feature: Employee can register time on activities
  Description:
  Actor: Employee

  Background: There is a project, an activity in the project and an employee assigned to the project
    Given there is a project with a given ID
    And there is an activity with a given ID
    And the admin login succeeds
    And an employee "TGB" is added to the planner
    And an employee "BOB" is added to the planner
    And a project manager "HBL" is added to the planner
    And the project is added to the planner
    And the activity is added to the project
    And the admin logout succeeds
    And the employee "HBL" logs in and is the current user
    And the activity is added to the project
    And the project manager assigns employee "TGB" to the activity in the project
    And the employee "TGB" is assigned to the activity in the project
    And the project manager assigns employee "BOB" to the activity in the project
    And the employee "BOB" is assigned to the activity in the project
	And the current user logs out
    And the employee "TGB" logs in and is the current user

  Scenario: Register time on activity in project assigned to
    Given the employee "TGB" has 0.0 hours registered to the activity
    And the activity has 0.0 registered hours
    When the employee "TGB" registers 7.0 hours to the activity
    Then the employee "TGB" has 7.0 hours registered to the activity
    And the activity has 7.0 registered hours
    Then the employee "TGB" registers 4.0 hours to the activity
    And the employee "TGB" has 11.0 hours registered to the activity
    And the activity has 11.0 registered hours
    When the current user logs out
    And the employee "BOB" logs in and is the current user
    And the employee "BOB" has 0.0 hours registered to the activity
    When the employee "BOB" registers 3.0 hours to the activity
    Then the employee "BOB" has 3.0 hours registered to the activity
    And the activity has 14.0 registered hours

  Scenario: Register negative time on activity in project assigned to
    Given the employee "TGB" has 0.0 hours registered to the activity
    And the activity has 0.0 registered hours
    When the employee "TGB" registers 7.0 hours to the activity
    Then the employee "TGB" has 7.0 hours registered to the activity
    And the activity has 7.0 registered hours
    When the employee "TGB" registers -3.0 hours to the activity
    And the employee "TGB" has 4.0 hours registered to the activity
    And the activity has 4.0 registered hours

  Scenario: Total registered time cannot be negative
    Given the employee "TGB" has 0.0 hours registered to the activity
    When the employee "TGB" registers 7.0 hours to the activity
    Then the employee "TGB" has 7.0 hours registered to the activity
    When the employee "TGB" registers -41.0 hours to the activity
    Then the error message "Registered time cannot be negative" is shown
    And the employee "TGB" has 7.0 hours registered to the activity

