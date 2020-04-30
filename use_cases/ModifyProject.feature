Feature: Modify project
  Description:
  Actor: Admin

  Scenario: Change name of project in planner
    Given the admin is logged in
    And there is a project with a given ID and "GPS29" as name
    And the project is added to the planner
    And the project is in the planner
    When the name of the project is changed to "Solfanger17"
    Then the name of the project in the planner is changed to "Solfanger17"