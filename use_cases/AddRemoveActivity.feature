# Ansvarlig: Andreas
Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Background: A project and a project manager exists in the planner
    Given the admin login succeeds
    And a project manager "HBL" is added to the planner
    And an employee "ABC" is added to the planner
    And there is a project with a given ID
    And the project is added to the planner
    And the admin logout succeeds
    And the employee "HBL" logs in and is the current user

  Scenario: Add empty activity to planner
    And there is an activity with a given ID
    When the activity is added to the planner
    Then the activity is in the planner

  Scenario: Add activity to planner
    Given the planner has 0 activities
    And there is an activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and a given ID
    When the activity is added to the planner
    Then the activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and same ID is in the planner
    And the planner has 1 activities

  Scenario: Change information of activity in planner
    And there is an activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and a given ID
    And the activity is added to the planner
    And the activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and same ID is in the planner
    When the project manager changes the planner-activity's to "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "10-09-2020", time usage 0.0
    Then the activity with name "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "10-09-2020", time usage 0.0 and same ID is in the planner

  Scenario: Remove activity from planner
    And there is an activity with a given ID
    And the activity is added to the planner
    And the activity is in the planner
    When the project manager removes the activity from the planner
    Then the activity is not in the planner

  Scenario: Remove activity from project
    Given there is an activity with a given ID
    And the activity is added to the project
    And the activity is in the project
    When the project manager removes the activity from the project
    And the activity is not in the project

  Scenario: Add activity to existing project
    Given there is an activity with a given ID
    And the project has 0 activities
    And the activity is added to the planner
    When the project manager adds the activity to the project
    Then the activity is added to the project in the planner

  Scenario: Change information of activity in project
    Given there is an activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and a given ID
    And the activity is added to the project
    And the activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and same ID is in the project
    When the project manager changes the project-activity's name to "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "10-09-2020", time usage 0.0
    Then the activity with name "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "10-09-2020", time usage 0.0 and same ID is in the project

  Scenario: Choose end date for an activity which is before start date
    Given there is an activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and a given ID
    And the activity is added to the project
    And the activity with name "ActivityName", description "An activity", start date "06-05-2020", end date "01-06-2020", time usage 11.5 and same ID is in the project
    When the project manager changes the project-activity's name to "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "06-09-2020", time usage 0.0
    Then the error message "End date must be after start date" is shown
    And the activity with name "Roadtrip", description "Event for senior employees", start date "07-09-2020", end date "08-09-2020", time usage 0.0 and same ID is in the project

  Scenario: Employee can be assigned to an activity
    Given there is an activity with a given ID
    And the activity is added to the project
    And the activity is in the project
    Given the project manager assigns employee "ABC" to the activity in the project
    Then the employee "ABC" is assigned to the activity

  # Fail scenarios
  Scenario: Attempt to add non-existent activity to existing project
    Given the planner has no activities
    When the project manager adds the activity with id 1 to the project
    Then the error message "Activity does not exist" is shown
    And the activity with id 1 is not in the project

  Scenario: Employee attempts to add activity to planner
    Given the current user logs out
    And there is an activity with a given ID
    And the employee "ABC" logs in and is the current user
    When the employee adds the activity to the planner
    Then the error message "Not authorized to add/remove activity" is shown
    And the activity is not in the planner

  Scenario: Attempt to remove non-existent activity from project
    Given there is an activity with a given ID
    And the activity is not in the project
    When the project manager removes the activity from the project
    And the error message "Activity does not exist" is shown
    And the activity is not in the project

  Scenario: Attempt to remove non-existent activity from planner
    Given there is an activity with a given ID
    And the activity is not in the planner
    When the project manager removes the activity from the planner
    And the error message "Activity does not exist" is shown
    And the activity is not in the planner