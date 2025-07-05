Feature: User Table

  Scenario Outline: As a user, I want to add a new user to the table
    Given I am on the user table page
    When I click on the Add User button
    Then I should see a form to add a new user
    And  I will enter the first name <firstName>

    Examples:
      | firstName |
      | john      |