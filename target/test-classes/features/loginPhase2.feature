Feature: Login Feature Scenario

  Background: 
    Given User has launched the application

@sanity
  Scenario Outline: Successful Login Path
    When User enters correct username as "<UserName>" and password as "<Password>"
    And User click on the Login Button
    Then User logs into Product page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  Scenario: Successful Login Path
    When User enters the correct username and password
    And User click on the Login Button
    Then User logs into Product page

@regression
  Scenario Outline: Login Failure Path
    When User enters incorrect username as "<UserName>" and password as "<Password>"
    And User click on the Login Button
    Then User should get the error message "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | UserName           | Password           |
      | incorrect username | incorrect_password |
