Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Scenario: Add an activity to an existing project
    Given there is a project with a given ID
    And the user is project manager
    And there is an activity
    When the activity is added to the project
    Then the activity is in the project


