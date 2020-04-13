Feature: Login
  Description:
  Actor: User

  Scenario: User login as employee
    Given an user "HBL" exists in the planner
    When the login "HBL" is entered
    Then the user "HBL" is logged in
    And the user is an employee

  Scenario: User fail to login as employee
    Given an user "HBL" exists in the planner
    When the login "HBK" is entered
    Then the user "HBL" is not logged in