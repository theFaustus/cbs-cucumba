Feature: Delete Users Admin Page

  This feature is about verifying the deleting of users while logged in as an admin

  Background:
    Given I am logged in as an admin user

  Scenario: On the view users tab users should be displayed

    Given I am on the home page
    When I click on the dashboard
    And I click on the users tab
    And I click on the delete
    Then I see notification about deleted user


