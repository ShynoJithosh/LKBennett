Feature: AddToBasket

  Background:
    Given I am on home page

  Scenario: Verify the functionality by adding an item
    When I click on 'shoes' category
    And I select the product
    And I select the particular colour and size
    And I click on'Add To Shopping Bag'
    Then I should see the mini shopping bag page


