
Feature: To Test Google Search
#  Tests the Google Search Feature

# simple format
#  @stability
#  Scenario: Test Google Search
#    Given User is on Google Search Page
#    When I enter search term in box
#    And I click on Search button
#    Then Show Results

# data table example
  Scenario Outline: Test Google Search
    Given User is on Google Search Page
    When I enter <search_term> in box
    And I click on Search button
    Then Show Results

    Examples:
    | search_term|
    | cucumber  |
    | java      |
