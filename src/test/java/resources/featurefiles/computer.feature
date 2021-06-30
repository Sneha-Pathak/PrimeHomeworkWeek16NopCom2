Feature: Computer Menu Test
  As a user I want navigate to sub category of computer Page

  @Regression
  Scenario: I should navigate to desktop page
    Given I am on Homepage
    When I click on Computer Menu
    And I click on Desktop menu
    Then I should navigate to desktop menu

  @Regression
  Scenario: I should navigate to Notebook page
    Given I am on Homepage
    When I click on Computer Menu
    And I click on Notebook menu
    Then I should navigate to Notebook menu

  @Regression
  Scenario: I should navigate to Software page
    Given I am on Homepage
    When I click on Computer Menu
    And I click on Software menu
    Then I should navigate to Software menu