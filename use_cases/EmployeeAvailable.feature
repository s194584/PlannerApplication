Feature: Check an employees availability by their activities
  Description:
  Actor: Project manager

  Background:
    Given the admin login succeeds
    And an employee "ABC" is added to the planner
    And employee "ABC" has an absence activity with start date "01-01-2021" and end date "06-01-2021"
    And the admin logout succeeds



  Scenario: Absent when selected start date is before absence period and selected end date is in absence period
    Given selected start date is "24-12-2020" and selected end date "03-01-2021"
    Then employee "ABC" is absent

  Scenario: Absent when selected start date is in absence period and selected end date is in absence period
    Given selected start date is "02-01-2020" and selected end date "04-01-2021"
    Then employee "ABC" is absent

  Scenario: Absent when selected start date is in absence period and selected end date is after absence period
    Given selected start date is "02-01-2020" and selected end date "11-01-2021"
    Then employee "ABC" is absent

  Scenario: Absent when selected start date is before absence period and selected end date is after absence period
    Given selected start date is "24-12-2020" and selected end date "10-01-2021"
    Then employee "ABC" is absent

  Scenario: Not absent when selected start date is before absence period and selected end date is before absence period
    Given selected start date is "19-12-2020" and selected end date "23-12-2020"
    Then employee "ABC" is not absent

  Scenario: Not absent when selected start date is after absence period and selected end date is after absence period
    Given selected start date is "13-01-2021" and selected end date "17-01-2021"
    Then employee "ABC" is not absent