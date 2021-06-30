Feature: Login Test
  As a user I want to login into nop commerce website


#  @Smoke
  Scenario: I should navigate to login page successfully
    Given I am on Homepage
    When I click on login link
    Then I should navigate to login page successfully


#  @Sanity
  Scenario: I should login successfully with valid credentials
    Given I am on Homepage
    When I click on login link
    And I enter email "mivaan@gmail.com"
    And I enter password "abcd123"
    And I click on login button
    Then I should login successfully


#  @Sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on Homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email                  | password | errorMessage                                                                                             |
      | sneha.pathak@yahoo.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found              |
      | mivaan@gmail.com       | abcd12   | Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect |
