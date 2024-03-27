Feature: https://webshop-agil-testautomatiserare.netlify.app/checkout
  This feature includes tests to verify functionality of the checkout page

    #Mia
  Scenario: Remove an item from the shopping cart
    Given User has navigated to the product page
    When User clicks on the "Add to cart" button
    And User navigates to the checkout page
    And User removes 1 item
    Then The item count in the shopping cart should decrease by 1


    #Mia
  Scenario: Add multiple items to the shopping cart
    Given Users has navigated to the product page
    When User clicks on the "Add to cart" button 5 times
    And Users navigates to the checkout page
    Then The item count in the shopping cart should be 5


    #Samuel
  Scenario Outline: User should see same product on checkout page as was added from the shop page
    Given User has navigated to the product page
    When User adds a specific product to the cart <addedProduct>
    And User has navigated to the checkout page
    Then User should see same product on checkout page <actualProduct>
    Examples:
      | addedProduct                                                            | actualProduct                                                          |
      | "Mens Casual Slim Fit"                                                  | "Mens Casual Slim Fit"                                                 |
      | "Lock and Love Women's Removable Hooded Faux Leather Moto Biker Jacket" | "Lock and Love Womens Removable Hooded Faux Leather Moto Biker Jacket" |
      | "Pierced Owl Rose Gold Plated Stainless Steel Double"                   | "Pierced Owl Rose Gold Plated Stainless Steel Double"                  |
      | "SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s"                   | "SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s"                  |

    #Semih
  Scenario: User should be able to add multiple products to the cart
    Given Users has navigated to the product page
    When User added multiple products to the cart
    Then Products should be added to cart

    #Semih
  Scenario: User should be able to move in and out from the checkout page
    Given Users has navigated to the product page
    When User clicks on the checkout button
    Then User should be navigated to checkout page
    When User clicks on shop button
    Then User should be navigated to shopping page



