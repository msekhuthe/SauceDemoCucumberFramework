Feature: Add product to cart

  Scenario: As a user, I want to add a product to my cart
    Given I am on the landing page
    When I click on the "Add to Cart" button for the product "Sauce Labs Backpack"
    Then I should see "Laptop has been added to your cart" icon
    And the cart should contain 1 item