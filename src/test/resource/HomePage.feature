Feature: HomePage Functionality

  @IndividualProduct
  Scenario: Search for individual product
    Given user is on the homepage of Argoes Website
    When user types Nike in the search box
    And user clicks on search button
    Then user should be able to see all the Nike products

    @Account
  Scenario: Check the Account functionality for login
    Given user is on the homepage of Argoes Website
    When user clicks on Account button
    And user enter his email "chiragmechengg@yahoo.com"
    And user enter his password "Harshul@23"
    And user click on sign in securly button
    Then user should be able to see his account page

    @Wishlist
  Scenario: Search for Wishlist
    Given user is on the homepage of Argoes Website
    When user clicks on Wishlist button
    Then user should be able to see his Wishlist page

    @MultipleSearch
 Scenario Outline:  Search for multiple products
   Given user is on the homepage of Argoes Website
   When user search for "<products>"
   Then user should able to see all products related to searched
   Examples:
   |products|
   | Nike   |
   | Puma   |


