Feature: Admin Login Page

  This feature is about verifying the login of admins

  Scenario: Submit cbs login form with valid details for admin

    Given I am on the login page
    When I complete all the fields with admin credentials of the login form
    And I click the login button
    Then I am logged in as an admin


