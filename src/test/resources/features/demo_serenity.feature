Feature: Manage Orders in the page of demo serenity.

  Scenario: Create an order from the Dashboard
    Given user credentials are in the page
    When user creates a new order
    Then the number of order should have increased by 1

  Scenario: Create and ship an order from the Dashboard
    Given user credentials are in the page
    When user creates a new order
    And ship the order
    Then the number of orders should not change

