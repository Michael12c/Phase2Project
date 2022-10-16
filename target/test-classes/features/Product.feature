Feature: Product Feature Scenario


  Background: 
    Given User has launched the application
    When User enters the correct username and password
    And User click on the Login Button

@sanity
  Scenario: This scenario is to define the Product page path
    When User click on product as "Sauce Labs Bike Light"
    Then User should proceed to cart
