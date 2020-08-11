Feature: EndToEnd

  Background:
    Given I am on home page

  Scenario: Verify the functionality of placing an order by click and collect
    When I click on 'shoes' category
    And I select the product
    And I select the particular colour and size
    And I click on'Add To Shopping Bag'
    And I mouseover and click on view shopping bag icon
    And I click on 'Checkout Securely'button
    And I enter valid emailId in guest checkout
    And I click on the 'Checkout Securely'button
    And I select click and collect from store option
    And I enter valid postcode
    And I click on search and select The address from dropdown
    And I enter valid informations in 'Your Details'
    |FirstName|Shyno|
    |LastName|Jithosh|
    |MobileNumber|07417513636|
    And I click on 'next'button
    And I select country from dropdownlist for 'Billing Address'
    And I click on 'Enter the Address manually'
      |FirstName|Shyno|
      |LastName|Jithosh|
    |BuildingName|5Reynes Close|
    |AddressLine1|Marston Moretaine|
      |AddressLine2|Bedford|
    |City|Bedford|
    |PostCode|MK430PG|
    And I click on 'Use This Address' button
    And I accept terms and conditions checkbox
    Then I click on payment card option and enter card details
    |CardNumber|4929 0000 0555 9|
    |NameOnCard|SJikku|
    |SecurityCode|123 |
    And I click on 'Purchase'button
    And I accept terms and conditions



