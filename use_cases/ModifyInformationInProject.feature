# Ansvarlig: Malthe
Feature: Modify project
  Description:
  Actor: Admin

  Scenario: Change name of a project in the planner
    Given the admin login succeeds
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020"
    And the project is added to the planner
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner
    When the admin changes the name of the project to "Lakseregisteret"
    Then there is a project with name "Lakseregisteret", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner

  Scenario: Change description of a project in the planner
    Given the admin login succeeds
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020"
    And the project is added to the planner
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner
    When the admin changes the description of the project to "A fishy database"
    Then there is a project with name "Fiskebasen", description "A fishy database", start date "14-06-2020", end date "07-09-2020" in the planner

  Scenario: Change start date of a project in the planner
    Given the admin login succeeds
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020"
    And the project is added to the planner
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner
    When the admin changes the start date of the project to "23-06-2020"
    Then there is a project with name "Fiskebasen", description "A database for fish", start date "23-06-2020", end date "07-09-2020" in the planner

  Scenario: Change end date of a project in the planner
    Given the admin login succeeds
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020"
    And the project is added to the planner
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner
    When the admin changes the end date of the project to "11-08-2020"
    Then there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "11-08-2020" in the planner