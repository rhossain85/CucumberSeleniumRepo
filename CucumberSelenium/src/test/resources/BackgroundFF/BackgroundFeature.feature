Feature: Create account of Facebook1
  As a user you need to open a facebook homepage and do the validation
  
  Background: Common Scenerio11
    Given User need to be on facebook login page

  Scenario: Validate first name field
  
    When User enters user "David" first name
    Then User checks user "David" first name is present
    And Close Browser
    
Scenario: Validate create user multiple field12

When User enters user "Ryan" first name
And User enters user "Jack" surname
#Then User checks user first name is present
Then User mobile field should be blank
And Close Browser

