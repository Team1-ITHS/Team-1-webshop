Feature: Checkout page form
  This feature includes test to verify the form functionality on the checkout page

  Background: User is on the checkout page with a product added to the cart
    Given user is on the products page
    And add product to cart
    And click on checkout

  Scenario Outline: User should get an error message when submitting an incomplete form on the checkout page
    Given user fills in the form with data <firstName> <lastName> <email> <address> <country> <city> <zipCode> <ccName> <ccNumber> <expDate> <cvv>
    When user click on continue to checkout
    Then user should get an error message
    Examples:
      | firstName | lastName   | email | address            | country   | city    | zipCode | ccName          | ccNumber   | expDate   | cvv   |
      | "test"    | "testsson" | ""    | "Jungmansgatan 12" | "Svergie" | "Malmö" | "21111" | "Test Testsson" | "12345678" | "2030/01" | "123" |

  Scenario: User should be notified on entering invalid mail id
    When user enters a invalid mail id
    And submits the form
    Then user should be notified with a error message