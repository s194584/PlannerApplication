Feature: Assign project manager to project
  Description:
  Actor: Admin

  Scenario: Admin assigns project manager to project
    Given the admin is logged in
    And there is a project manager with initials "ABC"
    And the project manager is added to the planner
    And there is a project with a given ID
    And the project is added to the planner
    When the admin assigns the project manager to the project
    Then the project manager is assigned to the project


  Scenario: Admin assigns employee as project manager to project
    Given the admin is logged in
    And there is an employee with initials "ABC"
    And the employee is added to the planner
    And there is a project with a given ID
    And the project is added to the planner
    When the admin assigns the employee as project manager to the project
    Then the employee is assigned as project manager to the project

#
  Scenario: Admin attempts to assign project manager to non-existing project
    Given the admin is logged in
    And there is a project manager with initials "ABC"
    And the project manager is added to the planner
    And there is a project with a given ID
    And the project is not in the planner
    When the admin assigns the project manager to the project
    Then the error message "Project does not exist" is shown
    And the project manager is not assigned to the project

#  Scenario: Admin attempts to assign employee as project manager to non-existing project