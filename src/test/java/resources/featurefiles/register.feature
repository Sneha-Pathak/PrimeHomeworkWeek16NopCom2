Feature: Register Test
  As a user I want to register in nop commerce website

#  @Smoke
  Scenario: I should navigate to register page successfully
    Given I am on Homepage
    When I click on register link
    Then I should navigate to register page successfully

#  @Regression
  Scenario: I should not register with invalid data
    Given I am on Homepage
    When I click on register link
    And I leave first name blank
    And I click on register button
    Then I should get error message register

#  @Smoke
  Scenario: I should register successfully with valid data
    Given I am on Homepage
    When I click on register link
    And I select gender male
    And I enter firstname "Mivaan"
    And I enter lastname "Pandya"
    And I select date of birth "13" "5" "1990"
    And I enter email "mivaan@gmail.com"
    And I enter password "abcd123"
    And I enter confirm password "abcd123"
    And I click on register button
    Then I should register successfully

