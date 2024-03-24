Feature: Test cases for shop page

  Background: The user is on the shop page
    Given The user clicks on the shop page
    Then The user is navigated to the shop page

  Scenario:I filter products by mens clothing
    When I click on the mens clothing from shop page
    Then Only mens clothing products must be visible

  Scenario:I filter products by womens clothing
    When I click on the womens clothing from shop page
    Then Only womens clothing products must be visible

  Scenario:I filter products by jewelery
    When I click on the jewelery from shop page
    Then Only jewelery products must be visible

  Scenario:I filter products by electronics
    When I click on the electronics from shop page
    Then Only electronic products must be visible

  Scenario:I remove the filter
    When I click on the all from shop page
    Then Only all products must be visible

    #Samuel
  Scenario: When user adds X amount of products to the cart the total amount inside checkout button should increase
    When adding 3 products to the cart
    Then number of products in the cart should be 3
