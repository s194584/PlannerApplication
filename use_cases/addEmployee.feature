Feature: Add employee
  Description:
  Actor: Admin

  Scenario: Add an employee to planner
    Given the user is the admin
    And there is an employee with initials "HBL"
    When the employee is added to the planner
    Then the employee is in the planner