Feature: Search

  Background:
    Given I am on home page

  Scenario Outline: Verify search with a valid product
    When I search for "<keyword>" keyword
    Then I should see the related results

    Examples:
    |keyword|
    |sandals|
    |black |
   |clutch bags |
   |Patti Sunshine Cotton Dress|

    Scenario: Verify search with category name
      Given I am on home page
      When I click on 'Accessories' category
      Then I should see the related results

      Scenario: Verify search with invalid product
        Given I am on home page
        When I search with invalid product 'drinks'
        Then I should not see any related results

