Feature: Add and remove project
  Description:
  Actor: Admin

  Scenario: Add an project to planner
    Given the user is the admin
    And there is a project with a given ID
    When the project is added to the planner
    Then the project is in the planner

