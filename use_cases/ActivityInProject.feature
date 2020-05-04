Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Scenario: Create an empty activity
    Given a project manager "HBL" exists in the planner
    And the employee is the current user
    And there is an activity with a given ID
    When the activity is added to the planner
    Then the activity is in the planner

  Scenario: Add activity to existing project
    Given there is a project with a given ID
    And there is an activity with a given ID
    And the admin login succeeds
    And the project is added to the planner
    And a project manager "HBL" exists in the planner
    And the employee is the current user
    When the project manager adds the activity to the project
    Then the activity is added to the project in the planner