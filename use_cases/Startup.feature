Feature: Planner startup
  Description:
  Actor: Planner Application

  Scenario: A new Planner application is initialized
    Given a planner application exists
    Then a user list "users" exists
    And a admin "000" exists
    And users contains admin "000"