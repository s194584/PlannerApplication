Feature: Add employee
  Description:
  Actor: Admin

  Scenario: Add an employee to planner while admin
    Given the user is the admin
    And there is an employee with initials "HBL"
    When the employee is added to the planner
    Then the employee is in the planner

#  Scenario: Add an employee to planner while not admin
#    Given the user is not the admin
#    And there is an employee with initials "HBL"
#    When the employee is added to the planner
#    Then the employee is not in the planner
#
#  Scenario: Add an employee that already exists
#    Given the user is the admin
#    And there is an employee with initials "HBL"
#    And there is an employee with initials "HBL" in the planner
#    When the employee is added to the planner
#    Then the messeage "Employee already in the planner" is given