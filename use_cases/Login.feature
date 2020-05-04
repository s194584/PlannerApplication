Feature: Login
  Description:
  Actor: User

  Scenario: Employee login succeeds
    Given an employee "HBL" exists in the planner
    And the user is not logged in
    When the login "HBL" is entered and succeeds
    Then the user "HBL" is logged in

  Scenario: Employee logout succeeds
    Given an employee "HBL" exists in the planner
    And the user is logged in
    When the user logout succeeds
    Then the user is not logged in

  Scenario: Admin login succeeds
    Given an admin exists in the planner
    And the user is not logged in
    When the admin login succeeds
    Then the user is logged in

  Scenario: Admin logout succeeds
    Given an admin exists in the planner
    And the user is logged in
    When the admin logout succeeds
    Then the user is not logged in

  Scenario: User login as employee
    Given an employee "HBL" exists in the planner
    And the user is not logged in
    When the login "HBL" is entered
    Then the user "HBL" is logged in
    And the user is an "Employee" class

  Scenario: User fail to login as employee
    Given an employee "HBL" exists in the planner
    And the user is not logged in
    When the login "HBK" is entered
    Then the user "HBL" is not logged in

  Scenario: User login as admin
    Given the user is the admin
    When the login "000" is entered
    Then the user "000" is logged in
    And the user is an "Admin" class

  Scenario: Current user logs out
    Given an employee "HBL" exists in the planner
    And the user is logged in
    When the user logout succeeds
    Then the user is not logged in


  Scenario: Attempts to log out without being logged in
    Given an employee "ABC" exists in the planner
    And the user is not logged in
    Then the user's attempt to log out fails