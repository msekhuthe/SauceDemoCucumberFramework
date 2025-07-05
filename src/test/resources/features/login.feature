Feature: SauceDemo Login

  Scenario Outline: As a user I want to login to sauce demo
    Given  I am on the login game
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then I should be on the home page
    When I add an item to the cart
    Then I should see the item in the cart
    When I click the cart icon
    Then I should see the cart page
    When  I click the checkout button
    Then I should see the checkout page
    When I enter first name <firstName>
    And I enter last name <lastName>
    And I enter zip code <postalCode>
    When I click the continue button
    Then I should see the overview page
    When I click the finish button
    Then I should see the completion page
    When I click the back home button
    Then I should see the home page



    Examples:
      | username      | password     | firstName | lastName | postalCode |
      | standard_user | secret_sauce | John      | Doe      | 12345      |
      #| performance_glitch_user | secret_sauce |