Feature: Manage Orders in the page of demo serenity.

  Scenario: Create a order from the Dashboard
    Given user credentials are in the page
    When user creates a new order
    Then the number of order should be 22