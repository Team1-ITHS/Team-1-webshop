Feature: https://webshop-agil-testautomatiserare.netlify.app/
  This feature includes tests to verify functionality of the start page

  Background: The user is on the start page
    Given User has navigated to the start page

    #Samuel
  Scenario: When on start page user should see correct page title
    Then the page title should be "Webbutiken"

    #Samuel
  Scenario: When user clicks on the checkout button on the start page user should be redirected to the checkout form page
    When the user click on the Checkout button
    Then the user should be redirected to the Checkout form page

    #Mia
  Scenario: Click on the Shop link
    When the user clicks on the "Shop" link
    Then the user should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/products"

        #Mia
  Scenario: Click on the Checkout link
    When the user clicks on the "Checkout" links
    Then the user should be redirected too "https://webshop-agil-testautomatiserare.netlify.app/checkout"

    #Mia
  Scenario: Click on the About link
    When the user click on the "About" link
    Then the users should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/#"
    #when About-site is available change to row below
    #Then the users should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/about"
  #divya
  Scenario: Click on the Home link
    When the user clicks on the Home link
    Then the user should be directed to home page

  Scenario: Minimize the screen to check the alignment of elements
    When user minimizes the screen
    Then the application should be aligned automatically accordingly
