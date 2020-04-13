Feature: Admin login
  Description: The admin logs into the library system and also logs out
  Actor: Admin

  Scenario: Admin can login
    Given the admin is not logged in
    Then the admin login succeeds
    And the admin is logged in

  Scenario: Administrator has the wrong password
    Given that the admin is not logged in
    And the password is "wrong password"
    Then the admin login fails
    And the admin is not logged in