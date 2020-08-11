Feature: Login

    Scenario: Verify the functionality with valid credentials
        Given I am on home page
        When I click on my account Icon and signin button
        And I enters valid credentials for login
            |email ID|shyjithosh@gmail.com|
            |password|shy2312605|
        And I click on login button
        Then I should get the customer account page


    Scenario: Verify the forgotten password functionality
        Given I am on home page
        When I click on my account Icon and signin button
        And I enters valid email
        And I click on forgot your password button
        Then I should direct to reset password page
        And I click on reset password button
        And I should get the password reset confirmation