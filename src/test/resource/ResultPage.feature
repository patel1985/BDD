Feature: ResultPage Functionalities

  Background:
    Given user is on the homepage of Argoes Website
    When user types Nike in the search box
    And user clicks on search button
    Then user should be able to see all the Nike products

    Scenario: Click on £5 to £10 price range
      Given user is on the ResultPage of Argoes website
      When user clicks on £5 to £10 price range checkbox
      Then user should able to see all the items within that price range