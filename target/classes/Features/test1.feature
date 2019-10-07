
Feature: Damir test 


 Background: 
  Given I go to Amazon page
  
  @Sprint1 @Positive
  Scenario: Positive
    Then I verify Logo 
    And I click Best Sellers
    
    @Sprint1 @Negative
   Scenario: Negative
     Then I fail my URL
   
