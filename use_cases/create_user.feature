Feature: Add employee
  Description:
  Actor: Admin

  Scenario: Add an employee to planner
    Given the admin is logged in
    And there is an employee with initials "HBL"
    When the employee is added to the planner
    Then the employee with initials "HBL" exists in the planner

