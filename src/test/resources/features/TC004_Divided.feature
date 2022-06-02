Feature: Divided

  Scenario: Divided two number
    Given On calculator app
    When I select second number
    When I click divided
    When I select first number
    When I click equal
    Then see the divided result and validate
