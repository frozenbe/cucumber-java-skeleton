Feature: Navigation

  Scenario: Navigation into universe landing page
    Given I type in universe homepage
    When I am not logged in
    Then I navigate into the page
