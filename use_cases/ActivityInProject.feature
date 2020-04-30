Feature: A project is able to have several activities
  Description:
  Actor: Project manager

  Scenario: Add an activity to an existing project
    Given the user is project manager
    And there is an activity with information, id, time usage,