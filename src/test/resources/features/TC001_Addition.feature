Feature: Addition

  Scenario: Addition two number
    Given On calculator app
    When I select first number
    When I click button add
    When I select second number
    When I click equal
    Then I see the addition result and validate
