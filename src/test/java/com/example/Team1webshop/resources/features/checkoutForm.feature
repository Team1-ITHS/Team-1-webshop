
Feature: Test cases for checkout form

  Background: The user is on the checkout page
    Given User has navigated to the checkout page

    Scenario Outline: User should not able to proceed checkout with incomplete form
      When user fill out "<FirstName>", "<LastName>", "<Email>", "<Address>","<Country>", "<City>", "<Zip>", "<NameOnCard>", "<CreditCardNumber>", "<ExpirationDate>", "<CVV>"
      And user clicks on checkout button
      Then a warning message should be seen on in complete filling area in the formpage

    Examples:
      | FirstName | LastName | Email           | Address         | Country  | City    | Zip   | NameOnCard    | CreditCardNumber  | ExpirationDate  | CVV |
      | Semih     | Bayri    | semih@gmail.com | Kungsgatan 55   |Sweden    | Uppsala | 45429 | Semih  Bayri  | 12345678          |05/04/2026       | 123 |

