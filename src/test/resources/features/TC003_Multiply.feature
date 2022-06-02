Feature: Multiply

  Scenario: Multiply two number
    Given On calculator app
    When I select first number
    When I click button multiply
    When I select second number
    When I click equal
    Then see the multiply result and validate
