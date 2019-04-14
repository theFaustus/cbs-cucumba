Feature: Create Users Admin Page

  This feature is about verifying the creating of users while logged in as an admin

  Background:
    Given I am logged in as an admin user

  Scenario: On the view users tab users should be displayed

    Given I am on the home page
    When I click on the dashboard
    And I click on the users tab
    And I click on the add
    And I complete all the fields of the add form
    And I click register button
    Then I see notification about created user


