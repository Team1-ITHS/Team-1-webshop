Feature: https://webshop-agil-testautomatiserare.netlify.app/checkout
  This feature includes tests to verify functionality of the checkout page

  Background: The user is on the checkout page
    Given User has navigated to the checkout page

  Scenario: pagess title test
    Then the pagess title should be "Webbutiken"

    #Mia
  Scenario: Remove an item from the shopping cart
    Given User has navigated to the product page
    When User clicks on the "Add to cart" button
    And User navigates to the checkout page
    And User removes 1 item
    Then The item count in the shopping cart should decrease by 1

    #Samuel
  Scenario Outline: User should see same product on checkout page as was added from the shop page
    Given User has navigated to the product page
    When User adds a specific product to the cart <addedProduct>
    And User has navigated to the checkout page
    Then User should see same product on checkout page <actualProduct>
    Examples:
      | addedProduct           | actualProduct          |
      | "Mens Casual Slim Fit" | "Mens Casual Slim Fit" |