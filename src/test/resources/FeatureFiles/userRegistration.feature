Feature: User Registration Page

  This feature is about verifying the registration of users

  Scenario: Submit cbs register form with valid details

    Given I am on the register page
    When I complete all the fields of the register form
    And I click the sign up button
    Then I see successful registration message


