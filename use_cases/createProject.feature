Feature: Create project
  Description:
  Actor: Admin

  Scenario: Add project to planner
    Given the user is the admin
    And a project exists with a given ID
    When the project is added to the planner
    Then the project is in the planner

  Scenario: Add project