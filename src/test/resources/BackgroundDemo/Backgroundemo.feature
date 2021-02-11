Feature: Test Background option on Google search

  Background: User is on Google Search Page
    Given User is on Google Search Page

  Scenario: Test Google Search
    When I enter Google in box
    And I click on Search button
    Then Show Results


  Scenario: Test Amazon Search
    When I enter Amazon in box
    And I click on Search button
    Then Show Results