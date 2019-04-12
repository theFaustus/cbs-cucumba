Feature: View Movies Page

  This feature is about verifying the displaying of movies

  Background:
    Given I am logged in

  Scenario: On the view movies tab movies should be displayed

    Given I am on the home page
    When I click on the board
    Then I see movies tab


