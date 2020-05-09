Feature: Add and remove project
  Description:
  Actor: Admin

  Scenario: Admin creates a project with information and adds it to the planner
    Given the admin login succeeds
    And there is a project with name "Pandekagehuset", description "Website for Pandekagehuset", start date "30-09-2020", end date "24-03-2021"
    When the project is added to the planner
    Then there is a project with name "Pandekagehuset", description "Website for Pandekagehuset", start date "30-09-2020", end date "24-03-2021" in the planner
    And the project's toString is "Pandekagehuset"

  Scenario: Admin creates a project with information and adds it to the planner
    Given the admin login succeeds
    And there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020"
    When the project is added to the planner
    Then there is a project with name "Fiskebasen", description "A database for fish", start date "14-06-2020", end date "07-09-2020" in the planner

  Scenario: Admin adds a project without information
    Given the admin login succeeds
    And there is a project with a given ID
    When the project is added to the planner
    Then the project is in the planner

  Scenario: Admin adds a project with name to planner
    Given the admin login succeeds
    And there is a project with a given ID and "Kookle" as name
    When the project is added to the planner
    Then the project with name "Kookle" and same ID is in the planner

  Scenario: Admin removes a project to planner
    Given the admin login succeeds
    And there is a project with a given ID
    And the project is added to the planner
    When the project is removed from the planner
    Then the project is not in the planner

  Scenario: Admin attempts to remove a project not in the planner
    Given the admin login succeeds
    And there is a project with a given ID
    And the project is not in the planner
    When the project is removed from the planner
    Then the error message "Project does not exist" is shown
    And the project is not in the planner

  #Fail scenarios:
  Scenario: Employee attempts to add a project to planner
    Given the admin is not logged in
    And there is a project with a given ID
    When the project is added to the planner
    Then the error message "Not authorized to add/remove project" is shown
    And the project is not in the planner

  Scenario: Employee attempts to remove a project from planner
    Given the admin login succeeds
    And there is a project with a given ID
    And the project is added to the planner
    And the admin logout succeeds
    When the project is removed from the planner
    Then the error message "Not authorized to add/remove project" is shown
    And the project is in the planner

    #Background: The library has a set of books
#	Given that the administrator is logged in
#	And these books are contained in the library
#		| Extreme Programming | Kent Beck | Beck99 |
#		| Test Driven Development | Kent Beck | Beck02 |
#		| Lean Software Development | Mary Poppendieck and Tom Poppendieck | Pop07 |
#		| Cucumber for Java | Seb Rose | Rose11 |
#	And the administrator logs out 