Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Scenario: Create an empty activity
    Given a project manager "HBL" exists in the planner
    And the employee is the current user
    And there is an activity with a given ID
    When the activity is added to the planner
    Then the activity is in the planner