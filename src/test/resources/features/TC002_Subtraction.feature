Feature: Subtraction

  Scenario: Subtraction two number
    Given On calculator app
    When I select second number
    When I click button subtraction
    When I select first number
    When I click equal
    Then see the subtraction result and validate
