Feature: Register

  Scenario: Verify the functionality with valid credentials for register
    Given I am on home page
    When I click on my account Icon and create account button
    And I enters all valid credentials for register
      |first name|shyno|
      |last name|jithosh|
      |telephone|07417513636|
      |email address|shyjithosh@gmail.com|
      |confirm email|shyjithosh@gmail.com|
      |password|shy2312605|
      |confirm password|shy2312605|
      Then I click on register button
      And I should see the register confirmation



