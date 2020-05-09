Feature: Login
  Description:
  Actor: User

  Background: Some employees exist in the planner
    Given the admin login succeeds
    And an employee "HBL" is added to the planner
    And an employee "ABC" is added to the planner
    And the admin logout succeeds

  Scenario: User login succeeds
    Given the user "HBL" is not logged in
    When the employee "HBL" logs in and is the current user
    Then the user "HBL" is logged in

  Scenario: User logout succeeds
    Given the employee "HBL" logs in and is the current user
    When the current user logs out
    Then the user "HBL" is not logged in

  Scenario: User login as employee
    Given the user "HBL" is not logged in
    When the employee "HBL" logs in and is the current user
    Then the user "HBL" is logged in
    And the user is an "Employee" class

  Scenario: User fails to log in
    When the employee "UIO" logs in and is the current user
    Then the error message "User does not exist" is shown

  Scenario: User login as admin
    Given the employee "000" logs in and is the current user
    Then the user "000" is logged in
    And the user is an "Admin" class

  Scenario: Attempts to log out without being logged in
    Given the user "ABC" is not logged in
    When the user "ABC" logs out
    Then the error message "User is not logged in" is shown
