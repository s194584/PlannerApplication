Feature: Check an employees availability by their activities
  Description:
  Actor: Project manager

  Background:
    Given the admin login succeeds
    And an employee "ABC" is added to the planner
    And employee "ABC" has an absence activity with start date "01-01-2021" and end date "06-01-2021"
    And a project manager "PRO" is added to the planner
    And there is a project with a given ID
    And the project is added to the planner
    And the admin logout succeeds
    And the employee "PRO" logs in and is the current user


  Scenario: Project manager attempts to assign absent employee to activity
    When the project manager assigns employee {string} to the activity in the project
