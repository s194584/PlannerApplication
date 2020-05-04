Feature: Login
  Description:
  Actor: User

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
    When the user logs out
    Then the user is not logged in


#  Scenario: User fail login as admin
#    Given the admin is not logged in
#    When the login "HBL" is entered
#    Then the user "000" is not logged in