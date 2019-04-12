Feature: User Login Page

  This feature is about verifying the login of users

  Scenario: Submit cbs login form with valid details

    Given I am on the login page
    When I complete all the fields of the login form
    And I click the login button
    Then I am logged in as an user


