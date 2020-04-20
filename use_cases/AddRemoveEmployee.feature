Feature: Add and remove employees
  Description:
  Actor: Admin

  Scenario: Add an employee to planner
    Given the user is the admin
    And there is an employee with initials "HBL"
    And an employee with initials "HBL" is not in the planner
    When the employee is added to the planner
    Then the employee is in the planner

  Scenario: Remove an employee from planner
    Given the user is the admin
    And there is an employee with initials "HBL"
    And the employee is added to the planner
    When the employee is removed from the planner
    Then an employee with initials "HBL" is not in the planner

  Scenario: Attempt to remove an employee that is not in the planner
    Given the user is the admin
    And there is an employee with initials "HBL"
    And an employee with initials "HBL" is not in the planner
    When the employee is removed from the planner
    Then the error message "User does not exist" is shown

  Scenario: Attempt to add employee already in the planner
    Given the user is the admin
    And there is an employee with initials "HBL"
    And the employee is added to the planner
    When the employee is added to the planner
    Then the error message "User already exists" is shown

  Scenario: Attempt to remove yourself
    Given the user is the admin
    And there is an employee with initials "000"
    When the employee is removed from the planner
    Then the error message "Admin cannot remove admin" is shown
    And the employee is in the planner

  Scenario: Attempt to add employee with not 3 initials
    Given the user is the admin
    And there is an employee with initials "ABCD"
    When the employee is added to the planner
    Then the error message "User must have 3 initials" is shown