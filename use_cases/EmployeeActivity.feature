Feature: Employee gets assigned to activities correctly
  Description:
  Actor: Project manager

  Background: Get employees assigned to activity
    Given the admin login succeeds
    And these employees are contained in the planner
        | ABC |
        | BOB |
        | FRT |
        | PKL |
        | TUJ |
    And a project manager "PRO" is added to the planner
    And there is a project with a given ID
    And the project is added to the planner
    And the admin assigns the employee "PRO" as project manager to the project
    And the admin logout succeeds
    And the employee "PRO" logs in and is the current user
    And there is an activity with a given ID
    And the activity is added to the project

  Scenario: Employees are correctly assigned to activities
    Given the project manager assigns employee "BOB" to the activity in the project
    And the project manager assigns employee "PKL" to the activity in the project
    And the project manager assigns employee "TUJ" to the activity in the project
    Then these employees are assigned to the activity
        | BOB |
        | PKL |
        | TUJ |
    And the employee "BOB" has the activity