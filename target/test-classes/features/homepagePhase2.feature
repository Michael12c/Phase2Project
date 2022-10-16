Feature: Product feature scenario

	Background:
		Given User enters correct username and password
  	When User click on the Login Button
		Then User logs into Products page
		
	Scenario: This scenario is to define the Product page
		When Click ADD TO CART on product "Sauce Labs Backpack"
		Then Basket item number should be "1"