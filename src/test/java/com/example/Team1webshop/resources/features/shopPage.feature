Feature: Test cases for shop page

  Background: The user is on the shop page
    Given The user clicks on the shop page
    Then The user is navigated to the shop page

  #divya
  Scenario: User filters products by mens clothing
    When user clicks on the mens clothing from shop page
    Then Only mens clothing products must be visible
  #divya
  Scenario: User filters products by womens clothing
    When user clicks on the womens clothing from shop page
    Then Only womens clothing products must be visible
  #divya
  Scenario: User filters products by jewelery
    When user clicks on the jewelery from shop page
    Then Only jewelery products must be visible
  #divya
  Scenario: User filters products by electronics
    When User clicks on the electronics from shop page
    Then Only electronic products must be visible
  #divya
  Scenario: User removes the filter
    When User clicks on the all from shop page
    Then Only all products must be visible
  #divya
  Scenario: User search for products
    When User enter a "Mens Casual" in the search field
    Then Relevant results are displayed
    And Results contain the keyword "Mens Casual"

    #Samuel
  Scenario: When user adds X amount of products to the cart the total amount inside checkout button should increase
    When adding 3 products to the cart
    Then number of products in the cart should be 3
