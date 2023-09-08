
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file
  
  Background: 
  Given I landed on Ecommerce website


  @tag2
  Scenario Outline: Positive case of submitting the order
    Given Logged in with username <name> and password<password>
    When I add product <productName> to cart
    And Checkout <productName> and submit the order
    Then I verify the <status> in step

    Examples: 
      | name					  |						 password			 | productName  |
      |changc@gmail.com |            Chang@123    | ZARA COAT 3 |
      
