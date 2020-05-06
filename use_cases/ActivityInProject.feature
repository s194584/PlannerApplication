Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Scenario: Create an empty activity
    Given a project manager "HBL" exists in the planner
    And the employee logs in and is the current user
    And there is an activity with a given ID
    When the activity is added to the planner
    Then the activity is in the planner

  Scenario: Add activity to existing project
    Given there is a project with a given ID
    And there is an activity with a given ID
    And the admin login succeeds
    And the project is added to the planner
    And the admin logout succeeds
    And a project manager "HBL" exists in the planner
    And the employee logs in and is the current user
    And the activity is added to the planner
    When the project manager adds the activity to the project
    Then the activity is added to the project in the planner

  Scenario: Attempt to add non-existant activity to existing project
    Given there is a project with a given ID
    And the admin login succeeds
    And the project is added to the planner
    And a project manager "HBL" exists in the planner
    And the employee logs in and is the current user
    And the planner has no activities
    When the project manager adds the activity with id 1 to the project
    Then the error message "Activity does not exist" is shown
    And the activity with id 1 is not in the project

  Scenario: Employee attempts to add activity to planner
    Given there is an activity with a given ID
    And an employee "ABC" exists in the planner
    And the employee logs in and is the current user
    When the employee adds the activity to the planner
    Then the error message "Not authorized to add/remove activity" is shown
    And the activity is not in the planner
