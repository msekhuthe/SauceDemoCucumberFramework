@addUser
Feature: User Table

  Scenario Outline: As a user, I want to add a new user to the table
    Given I am on the user table page
    When I click on the Add User button
    Then I should see a form to add a new user
    And  I will enter the first name <firstName>
    And I will enter the last name <lastName>
    And I will enter the username <firstName> and <lastName>
#    And I will enter the password <password>
#    And I will select the customer
#    And I will select the role
#    And I will enter the email <email>
#    And I will enter the cell phone <cellPhone>
#    Then I will click on the Save button

    Examples:
      | firstName | lastName |
      | john      | Doe      |